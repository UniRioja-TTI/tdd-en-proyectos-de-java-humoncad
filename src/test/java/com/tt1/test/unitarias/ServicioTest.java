package com.tt1.test.unitarias;

import com.tt1.test.Servicio;
import com.tt1.test.mocks.MailerMock;
import com.tt1.test.mocks.RepositorioMock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ServicioTest {

    private Servicio servicio;
    private RepositorioMock repoMock;
    private MailerMock mailMock;

    @BeforeEach
    void setUp() {
        repoMock = new RepositorioMock();
        mailMock = new MailerMock();
        servicio = new Servicio(repoMock, mailMock);
    }

    @Test
    void consultarPendientesDebeEjecutarse() {
        assertNotNull(servicio.consultarPendientes());
    }
    @AfterEach
    void tearDown() {
    }

    @Test
    void crearTarea() {
    }

    @Test
    void añadirEmail() {
    }

    @Test
    void marcarComoFinalizada() {
    }

    @Test
    void consultarPendientes() {
    }
}