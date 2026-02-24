package com.tt1.test;

import java.util.List;

public class Repositorio {
    private final DBStub db;

    public Repositorio(DBStub db) {
        this.db = db;
    }

    public void guardarTarea(ToDo tarea) {
        db.crear(tarea);
    }

    public void completarTarea(String nombre) {
        ToDo t = encontrarTarea(nombre);
        if (t != null) {
            t.setCompletado(true);
            db.actualizar(t);
        }
    }

    public ToDo encontrarTarea(String nombre) {
        return db.leer(nombre);
    }

    public void guardarEmail(String email) {
        db.agregarEmail(email);
    }

    public List<ToDo> obtenerTodos() {
        return db.getTodasLasTareas();
    }
}