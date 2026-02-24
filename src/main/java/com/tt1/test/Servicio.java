package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

public class Servicio {
    private final Repositorio repo;
    private final MailerStub ms;

    // Aquí en esta clase servicio es donde se realizara la validación de los datos, para
    // que los pasados al repositorio, sean correctos.
    public Servicio(Repositorio r, MailerStub ms) {
        this.repo = r;
        this.ms = ms;
    }

    public void crearTarea(String nombre, LocalDate fechaLimite) {
        if (nombre == null || nombre.isEmpty()) return; // Validamos el campo

        ToDo nueva = new ToDo();
        nueva.setNombre(nombre);
        nueva.setFechaLimite(fechaLimite);
        nueva.setCompletado(false);

        repo.guardarTarea(nueva);
    }

    public void añadirEmail(String email) {
        if (email != null && email.contains("@gmail.com")) { // Validamos que sea formato email
            repo.guardarEmail(email);
        }
    }

    public void marcarComoFinalizada(String nombre) {
        repo.completarTarea(nombre);
    }

    public List<ToDo> consultarPendientes() {
        return repo.obtenerTodos().stream()
            .filter(t -> !t.isCompletado())
            .toList();
    }

}