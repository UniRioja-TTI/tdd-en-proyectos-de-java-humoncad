package com.tt1.test;

import java.util.List;

public class Repositorio {
    private final DBStub db;
    public Repositorio(DBStub db) {
        this.db = db;
    }

    public void guardarTarea(ToDo tarea) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void completarTarea(String nombre) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public ToDo encontrarTarea(String nombre) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void guardarEmail(String email) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public List<ToDo> obtenerTodos() { throw new UnsupportedOperationException("Clase aún no implementada."); }
}