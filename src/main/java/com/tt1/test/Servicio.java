package com.tt1.test;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Servicio principal que coordina las operaciones de gestión de tareas.
 * Gestiona la creación, actualización y listado de tareas, así como el envío de alertas por correo.
 *
 * @author Santiago Die Morejón
 * @version 1.0
 */
public class Servicio {
    /** Repositorio para acceder a las tareas y emails. */
    private IRepositorio repositorio;

    /** Servicio de envío de correos electrónicos. */
    private IMailer mailer;

    /**
     * Constructor que inicializa el servicio con sus dependencias.
     *
     * @param repositorio Repositorio para gestionar tareas y emails.
     * @param mailer Servicio de envío de correos.
     */
    public Servicio(IRepositorio repositorio, IMailer mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }
    /**
     * Crea una nueva tarea en el sistema.
     *
     * @param nombre Nombre de la nueva tarea.
     * @param fechaLimite Fecha límite de la tarea.
     */
    public void crearTarea(String nombre, LocalDate fechaLimite) {
        ToDo tarea = new ToDo(nombre, "", fechaLimite);
        repositorio.guardarTarea(tarea);
        comprobarYAlertarVencidas();
    }
    /**
     * Agrega un email al sistema para recibir notificaciones de tareas vencidas.
     *
     * @param email Dirección de correo electrónico a registrar.
     */
    public void agregarEmail(String email) {
        repositorio.guardarEmail(email);
        comprobarYAlertarVencidas();
    }
    /**
     * Marca una tarea como completada.
     *
     * @param nombre Nombre de la tarea a marcar como completada.
     */
    public void marcarComoCompletada(String nombre) {
        repositorio.marcarComoCompletada(nombre);
        comprobarYAlertarVencidas();
    }
    /**
     * Lista todas las tareas pendientes (no completadas).
     *
     * @return Lista de tareas pendientes.
     */
    public List<ToDo> listarPendientes() {
        comprobarYAlertarVencidas();
        return repositorio.listarTareas().stream()
                .filter(t -> !t.isCompletado())
                .collect(Collectors.toList());
    }
    /**
     * Comprueba si hay tareas vencidas y envía alertas por correo a todos los emails registrados.
     */
    private void comprobarYAlertarVencidas() {
        List<ToDo> vencidas = repositorio.listarTareas().stream()
                .filter(t -> !t.isCompletado() && t.getFechaLimite().isBefore(LocalDate.now()))
                .collect(Collectors.toList());

        if (!vencidas.isEmpty()) {
            List<String> emails = repositorio.obtenerEmails();
            for (ToDo tarea : vencidas) {
                for (String email : emails) {
                    mailer.enviarCorreo(email, "La tarea '" + tarea.getNombre() + "' ha vencido.");
                }
            }
        }
    }
}
