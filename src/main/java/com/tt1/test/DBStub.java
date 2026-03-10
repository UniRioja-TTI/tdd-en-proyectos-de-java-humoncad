package com.tt1.test;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

/**
 * Simulación de base de datos (es un stub), para el almacenamiento persistente de tareas y correos.
 * Utiliza estructuras en memoria para gestionar la información durante la ejecución.
 */
public class DBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private Set<String> agendaEmails = new HashSet<>();

    // CRUD de tareas:

    /**
     * Almacena una nueva tarea en la lista.
     * @param tarea El objeto ToDo que vamos a guardar.
     */
    public void crear(ToDo tarea) {
        this.tareas.add(tarea);
    }

    /**
     * Busca una tarea por su nombre exacto.
     * @param nombre El nombre de la tarea a buscar.
     * @return El objeto ToDo si se encuentra, o null en caso contrario.
     */
    public ToDo leer(String nombre) {
        return tareas.stream()
            .filter(t -> t.getNombre().equals(nombre))
            .findFirst()
            .orElse(null);
    }

    /**
     * Reemplaza una tarea existente por una versión actualizada.
     * @param tarea El objeto ToDo con los nuevos datos.
     */
    public void actualizar(ToDo tarea) {
        borrar(tarea.getNombre());
        crear(tarea);
    }

    /**
     * Elimina una tarea de la base de datos.
     * @param nombre El nombre de la tarea que se desea eliminar.
     */
    public void borrar(String nombre) {
        tareas.removeIf(t -> t.getNombre().equals(nombre));
    }

    /**
     * @return Una copia de la lista con todas las tareas almacenadas.
     */
    public List<ToDo> getTodasLasTareas() {
        return new ArrayList<>(tareas);
    }

    /**
     * @return El conjunto de emails registrados en la agenda.
     */
    public Set<String> getAgendaEmails() {
        return agendaEmails;
    }

    /**
     * Registra un nuevo email evitando duplicados.
     * @param email La dirección de correo electrónico a añadir.
     */
    public void agregarEmail(String email) {
        this.agendaEmails.add(email);
    }
}