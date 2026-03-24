package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación stub (simulada) de la base de datos para pruebas.
 * Almacena tareas y emails en memoria usando listas.
 *
 * @author Santiago Die Morejón
 * @version 1.0
 */
public class DBStub implements IDB {
    /** Lista de tareas almacenadas en memoria. */
    private List<ToDo> tareas = new ArrayList<>();

    /** Lista de emails almacenados en memoria. */
    private List<String> emails = new ArrayList<>();

    /**
     * Agrega una tarea a la lista en memoria.
     *
     * @param tarea Tarea a agregar.
     */
    @Override
    public void agregarTarea(ToDo tarea) {
        tareas.add(tarea);
    }

    /**
     * Busca una tarea por su nombre en la lista.
     *
     * @param nombre Nombre de la tarea a buscar.
     * @return La tarea encontrada o null si no existe.
     */
    @Override
    public ToDo buscarTarea(String nombre) {
        return tareas.stream()
                .filter(t -> t.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    /**
     * Obtiene una copia de todas las tareas almacenadas.
     *
     * @return Lista con todas las tareas.
     */
    @Override
    public List<ToDo> obtenerTodas() {
        return new ArrayList<>(tareas);
    }

    /**
     * Actualiza una tarea existente buscándola por nombre y reemplazándola.
     *
     * @param tarea Tarea con los datos actualizados.
     */
    @Override
    public void actualizarTarea(ToDo tarea) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getNombre().equals(tarea.getNombre())) {
                tareas.set(i, tarea);
                return;
            }
        }
    }

    /**
     * Elimina una tarea de la lista por su nombre.
     *
     * @param nombre Nombre de la tarea a eliminar.
     */
    @Override
    public void eliminarTarea(String nombre) {
        tareas.removeIf(t -> t.getNombre().equals(nombre));
    }

    /**
     * Agrega un email a la lista en memoria.
     *
     * @param email Dirección de correo electrónico a agregar.
     */
    @Override
    public void agregarEmail(String email) {
        emails.add(email);
    }

    /**
     * Obtiene una copia de todos los emails almacenados.
     *
     * @return Lista con todos los emails.
     */
    @Override
    public List<String> obtenerEmails() {
        return new ArrayList<>(emails);
    }
}
