package com.tt1.test;

import java.time.LocalDate;

/**
 * Representa una tarea (To-Do) en el sistema de gestión de tareas.
 * Contiene información sobre el nombre, descripción, fecha límite y estado de completitud.
 *
 * @author Santiago Die Morejón
 * @version 1.0
 */
public class ToDo {
    /** Nombre identificativo de la tarea. */
    private String nombre;

    /** Descripción detallada de la tarea. */
    private String descripcion;

    /** Fecha límite para completar la tarea. */
    private LocalDate fechaLimite;

    /** Indica si la tarea ha sido completada. */
    private boolean completado;

    /**
     * Constructor por defecto sin argumentos.
     */
    public ToDo() {}

    /**
     * Constructor parametrizado que inicializa una tarea con sus datos principales.
     *
     * @param nombre Nombre de la tarea.
     * @param descripcion Descripción de la tarea.
     * @param fechaLimite Fecha límite para completar la tarea.
     */
    public ToDo(String nombre, String descripcion, LocalDate fechaLimite) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.completado = false;
    }
    // getters y setters
    /**
     * Obtiene el nombre de la tarea.
     *
     * @return El nombre de la tarea.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la tarea.
     *
     * @param nombre El nuevo nombre de la tarea.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción de la tarea.
     *
     * @return La descripción de la tarea.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción de la tarea.
     *
     * @param descripcion La nueva descripción de la tarea.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la fecha límite de la tarea.
     *
     * @return La fecha límite de la tarea.
     */
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    /**
     * Establece la fecha límite de la tarea.
     *
     * @param fechaLimite La nueva fecha límite de la tarea.
     */
    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * Verifica si la tarea ha sido completada.
     *
     * @return true si la tarea está completada, false en caso contrario.
     */
    public boolean isCompletado() {
        return completado;
    }

    /**
     * Establece el estado de completitud de la tarea.
     *
     * @param completado true para marcar como completada, false en caso contrario.
     */
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
