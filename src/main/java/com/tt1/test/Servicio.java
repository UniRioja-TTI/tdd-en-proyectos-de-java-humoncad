package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase principal de servicios que contiene la lógica de negocio y validaciones.
 * Se encarga de coordinar las operaciones entre el repositorio y los servicios externos.
 */
public class Servicio {
    private final Repositorio repo;
    private final MailerStub ms;


    /**
     * Construye el servicio inyectando sus dependencias necesarias.
     * Aquí en esta clase servicio es donde se realizara la validación de los datos, para
     * que los pasados al repositorio, sean correctos.
     * @param r Repositorio para la gestión de datos.
     * @param ms Servicio de mensajería para notificaciones.
     */
    public Servicio(Repositorio r, MailerStub ms) {
        this.repo = r;
        this.ms = ms;
    }

    /**
     * Crea una nueva tarea validando que el nombre no sea nulo o vacío.
     * @param nombre Nombre descriptivo de la tarea.
     * @param fechaLimite Fecha tope para realizarla.
     */
    public void crearTarea(String nombre, LocalDate fechaLimite) {
        if (nombre == null || nombre.isEmpty()) return; // Validamos el campo

        ToDo nueva = new ToDo();
        nueva.setNombre(nombre);
        nueva.setFechaLimite(fechaLimite);
        nueva.setCompletado(false);

        repo.guardarTarea(nueva);
    }

    /**
     * Añade un email al sistema validando que pertenezca al dominio @gmail.com.
     * @param email Dirección de correo a validar e insertar.
     */
    public void aniadirEmail(String email) {
        if (email != null && email.contains("@gmail.com")) {
            repo.guardarEmail(email);
        }
    }

    /**
     * Marca una tarea como finalizada, buscando por su nombre.
     * @param nombre Nombre de la tarea que se marca como finalizada.
     */
    public void marcarComoFinalizada(String nombre) {
        repo.completarTarea(nombre);
    }

    /**
     * Recupera únicamente las tareas que no han sido marcadas como completadas.
     * @return Una lista filtrada de tareas pendientes.
     */
    public List<ToDo> consultarPendientes() {
        return repo.obtenerTodos().stream()
            .filter(t -> !t.isCompletado())
            .toList();
    }

}