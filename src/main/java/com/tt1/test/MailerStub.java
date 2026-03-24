package com.tt1.test;

/**
 * Implementación stub (simulada) del servicio de envío de correos para pruebas.
 * Imprime los correos en consola en lugar de enviarlos realmente.
 *
 * @author Santiago Die Morejón
 * @version 1.0
 */
public class MailerStub implements IMailer {

    /**
     * Simula el envío de un correo imprimiendo el destinatario y mensaje en consola.
     *
     * @param direccion Dirección de correo electrónico del destinatario.
     * @param mensaje Contenido del mensaje.
     * @return Siempre retorna true indicando envío exitoso.
     */
    @Override
    public boolean enviarCorreo(String direccion, String mensaje) {
        System.out.println("Destinatario: " + direccion);
        System.out.println("Mensaje: " + mensaje);
        return true;
    }
}
