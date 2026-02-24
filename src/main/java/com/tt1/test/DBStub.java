package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

public class DBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    public void agregarTarea(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo buscarTarea(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> obtenerTodas() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void actualizarTarea(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void eliminarTarea(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<String> obtenerEmails() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
