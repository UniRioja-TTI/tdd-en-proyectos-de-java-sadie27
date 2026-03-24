package com.tt1.test;

/**
 * Interfaz que define el contrato para el servicio de envío de correos electrónicos.
 *
 * @author Santiago Die Morejón
 * @version 1.0
 */
public interface IMailer {
    /**
     * Envía un correo electrónico a una dirección especificada.
     *
     * @param direccion Dirección de correo electrónico del destinatario.
     * @param mensaje Contenido del mensaje a enviar.
     * @return true si el correo se envió correctamente, false en caso contrario.
     */
    boolean enviarCorreo(String direccion, String mensaje);
}
