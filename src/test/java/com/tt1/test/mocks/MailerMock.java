package com.tt1.test.mocks;

import com.tt1.test.MailerStub;

public class MailerMock extends MailerStub {
    private boolean seLlamoAEnviar = false;
    private String ultimoMensaje;

    @Override
    public boolean enviarCorreo(String direccion, String mensaje) {
        this.seLlamoAEnviar = true;
        this.ultimoMensaje = mensaje;
        return true;
    }

    public boolean isSeLlamoAEnviar() {
        return seLlamoAEnviar;
    }
}