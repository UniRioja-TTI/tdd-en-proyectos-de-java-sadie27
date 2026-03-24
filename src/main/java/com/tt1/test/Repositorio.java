package com.tt1.test;

import java.util.List;

/**
 * Implementación del repositorio de tareas que actúa como intermediario entre la capa de servicio y la base de datos.
 *
 * @author Santiago Die Morejón
 * @version 1.0
 */
public class Repositorio implements IRepositorio {
    /** Interfaz de acceso a la base de datos. */
    private IDB db;

    /**
     * Constructor que inicializa el repositorio con una instancia de base de datos.
     *
     * @param db Instancia de base de datos.
     */
    public Repositorio(IDB db) {
        this.db = db;
    }

    /**
     * Busca y retorna una tarea por su nombre.
     *
     * @param nombre Nombre de la tarea a buscar.
     * @return La tarea encontrada o null si no existe.
     */
    @Override
    public ToDo encontrarTarea(String nombre) {
        return db.buscarTarea(nombre);
    }

    /**
     * Marca una tarea como completada.
     *
     * @param nombre Nombre de la tarea a marcar como completada.
     */
    @Override
    public void marcarComoCompletada(String nombre) {
        ToDo tarea = db.buscarTarea(nombre);
        if (tarea != null) {
            tarea.setCompletado(true);
            db.actualizarTarea(tarea);
        }
    }

    /**
     * Guarda una nueva tarea en la base de datos.
     *
     * @param tarea Tarea a guardar.
     */
    @Override
    public void guardarTarea(ToDo tarea) {
        db.agregarTarea(tarea);
    }

    /**
     * Guarda un email en la base de datos para recibir notificaciones.
     *
     * @param email Dirección de correo electrónico a guardar.
     */
    @Override
    public void guardarEmail(String email) {
        db.agregarEmail(email);
    }

    /**
     * Obtiene todas las tareas almacenadas.
     *
     * @return Lista de todas las tareas.
     */
    @Override
    public List<ToDo> listarTareas() {
        return db.obtenerTodas();
    }

    /**
     * Obtiene todos los emails registrados.
     *
     * @return Lista de emails registrados.
     */
    @Override
    public List<String> obtenerEmails() {
        return db.obtenerEmails();
    }
}
