package com.tt1.test;

import java.util.List;

/**
 * Interfaz que define el contrato para el repositorio de tareas y emails.
 * Proporciona operaciones de persistencia y consulta.
 *
 * @author Santiago Die Morejón
 * @version 1.0
 */
public interface IRepositorio {
    /**
     * Guarda una nueva tarea en el repositorio.
     *
     * @param tarea Tarea a guardar.
     */
    void guardarTarea(ToDo tarea);

    /**
     * Busca y retorna una tarea por su nombre.
     *
     * @param nombre Nombre de la tarea a buscar.
     * @return La tarea encontrada o null si no existe.
     */
    ToDo encontrarTarea(String nombre);

    /**
     * Marca una tarea como completada.
     *
     * @param nombre Nombre de la tarea a marcar como completada.
     */
    void marcarComoCompletada(String nombre);

    /**
     * Guarda un email en el repositorio.
     *
     * @param email Dirección de correo electrónico a guardar.
     */
    void guardarEmail(String email);

    /**
     * Obtiene todas las tareas almacenadas.
     *
     * @return Lista de todas las tareas.
     */
    List<ToDo> listarTareas();

    /**
     * Obtiene todos los emails registrados.
     *
     * @return Lista de emails registrados.
     */
    List<String> obtenerEmails();
}
