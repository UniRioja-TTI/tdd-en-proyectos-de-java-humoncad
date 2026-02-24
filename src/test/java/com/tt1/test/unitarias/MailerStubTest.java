package com.tt1.test.unitarias;

import com.tt1.test.MailerStub;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MailerStubTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void enviarCorreoDebeConfirmarExito() {
        MailerStub mailer = new MailerStub();
        // Act & Assert
        assertTrue(mailer.enviarCorreo("socio@test.com", "Mensaje"), "Debe devolver true al enviar");
    }

    @Test
    void enviarCorreo() {
    }
}