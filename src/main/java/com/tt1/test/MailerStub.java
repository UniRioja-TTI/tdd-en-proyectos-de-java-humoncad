package com.tt1.test;

/**
 * Servicio simulado para el envío de notificaciones por correo electrónico.
 */
public class MailerStub {

    /**
     * Simula el proceso de envío de un correo mostrando el contenido por consola.
     * @param direccion Destinatario del correo.
     * @param mensaje Cuerpo del mensaje a enviar.
     * @return true indicando que el proceso de envío se inició correctamente.
     */
    public boolean enviarCorreo(String direccion, String mensaje) {
        System.out.println("ENVIANDO CORREO A: " + direccion);
        System.out.println("MENSAJE: " + mensaje);
        return true;
    }
}