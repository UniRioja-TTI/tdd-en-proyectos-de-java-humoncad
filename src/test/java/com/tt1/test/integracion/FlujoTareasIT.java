package com.tt1.test.integracion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tt1.test.*;
import java.time.LocalDate;
import java.util.List;

class FlujoTareasIT {
    private DBStub db;
    private Repositorio repo;
    private Servicio servicio;
    private MailerStub mailer;

    @BeforeEach
    void setUp() {
        db = new DBStub();
        repo = new Repositorio(db);
        mailer = new MailerStub();
        servicio = new Servicio(repo, mailer);
    }

    @Test
    void testCrearTareaYConsultarPendiente() {
        String nombreTarea = "Completar Práctica 3";
        LocalDate fecha = LocalDate.now().plusDays(1);

        servicio.crearTarea(nombreTarea, fecha);

        List<ToDo> pendientes = servicio.consultarPendientes();

        assertFalse(pendientes.isEmpty(), "La lista de pendientes no debería estar vacía");
        assertEquals(nombreTarea, pendientes.get(0).getNombre());
    }
}