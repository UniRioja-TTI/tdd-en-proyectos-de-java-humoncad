package com.tt1.test;

public class MailerStub {
    public boolean enviarCorreo(String direccion, String mensaje) {
        System.out.println("ENVIANDO CORREO A: " + direccion);
        System.out.println("MENSAJE: " + mensaje);
        return true;
    }
}