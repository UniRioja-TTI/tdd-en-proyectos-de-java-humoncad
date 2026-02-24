package com.tt1.test;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class DBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private Set<String> agendaEmails = new HashSet<>();

    // CRUD de tareas
    public void crear(ToDo tarea) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public ToDo leer(String nombre) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void actualizar(ToDo tarea) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void borrar(String nombre) { throw new UnsupportedOperationException("Clase aún no implementada."); }

    public List<ToDo> getTodasLasTareas() { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public Set<String> getAgendaEmails() { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void agregarEmail(String email) { throw new UnsupportedOperationException("Clase aún no implementada."); }
}