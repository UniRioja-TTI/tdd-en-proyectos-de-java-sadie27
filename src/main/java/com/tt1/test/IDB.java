package com.tt1.test;

import java.util.List;

/**
 * Interfaz que define el contrato para el acceso a la base de datos.
 * Proporciona operaciones CRUD para tareas y gestión de emails.
 *
 * @author Santiago Die Morejón
 * @version 1.0
 */
public interface IDB {
    /**
     * Agrega una nueva tarea a la base de datos.
     *
     * @param tarea Tarea a agregar.
     */
    void agregarTarea(ToDo tarea);

    /**
     * Busca una tarea por su nombre.
     *
     * @param nombre Nombre de la tarea a buscar.
     * @return La tarea encontrada o null si no existe.
     */
    ToDo buscarTarea(String nombre);

    /**
     * Obtiene todas las tareas almacenadas.
     *
     * @return Lista de todas las tareas.
     */
    List<ToDo> obtenerTodas();

    /**
     * Actualiza una tarea existente en la base de datos.
     *
     * @param tarea Tarea con los datos actualizados.
     */
    void actualizarTarea(ToDo tarea);

    /**
     * Elimina una tarea de la base de datos.
     *
     * @param nombre Nombre de la tarea a eliminar.
     */
    void eliminarTarea(String nombre);

    /**
     * Agrega un email a la base de datos.
     *
     * @param email Dirección de correo electrónico a agregar.
     */
    void agregarEmail(String email);

    /**
     * Obtiene todos los emails almacenados.
     *
     * @return Lista de emails registrados.
     */
    List<String> obtenerEmails();
}
