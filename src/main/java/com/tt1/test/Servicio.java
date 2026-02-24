package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

public class Servicio {
    private final Repositorio repo;
    private final MailerStub ms;
    public Servicio(Repositorio r, MailerStub ms) {
        this.repo = r;
        this.ms = ms;
    }
    public void crearTarea(String nombre, LocalDate fechaLimite) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void añadirEmail(String email) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void marcarComoFinalizada(String nombre) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public List<ToDo> consultarPendientes() { throw new UnsupportedOperationException("Clase aún no implementada."); }

    // Lógica automática de alertas
    private void comprobarAlertasYNotificar() { throw new UnsupportedOperationException("Clase aún no implementada."); }
}