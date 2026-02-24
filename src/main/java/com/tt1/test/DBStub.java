package com.tt1.test;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class DBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private Set<String> agendaEmails = new HashSet<>();

    // CRUD de tareas
    public void crear(ToDo tarea) {
        this.tareas.add(tarea);
    }

    public ToDo leer(String nombre) {
        return tareas.stream()
            .filter(t -> t.getNombre().equals(nombre))
            .findFirst()
            .orElse(null);
    }

    public void actualizar(ToDo tarea) {
        borrar(tarea.getNombre());
        crear(tarea);
    }

    public void borrar(String nombre) {
        tareas.removeIf(t -> t.getNombre().equals(nombre));
    }

    public List<ToDo> getTodasLasTareas() {
        return new ArrayList<>(tareas);
    }

    public Set<String> getAgendaEmails() {
        return agendaEmails;
    }

    public void agregarEmail(String email) {
        this.agendaEmails.add(email);
    }
}