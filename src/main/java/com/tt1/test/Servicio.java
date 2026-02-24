package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

public class Servicio {
    private Repositorio repositorio;
    private MailerStub mailer;

    public Servicio(Repositorio repositorio, MailerStub mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    public void crearTarea(String nombre, LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void marcarComoCompletada(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> listarPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    private void comprobarYAlertarVencidas() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
