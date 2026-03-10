package com.tt1.test;

import java.util.List;

/**
 * Capa de acceso a datos que intermedia entre la lógica de negocio y la persistencia.
 */
public class Repositorio {
    private final DBStub db;

    /**
     * Constructor que inicializa el repositorio con una base de datos específica.
     * @param db La instancia de DBStub que se utilizará como almacenamiento.
     */
    public Repositorio(DBStub db) {
        this.db = db;
    }

    /**
     * Delega la creación de una tarea en la base de datos.
     * @param tarea Tarea a persistir.
     */
    public void guardarTarea(ToDo tarea) {
        db.crear(tarea);
    }

    /**
     * Marca una tarea como finalizada y actualiza el registro.
     * @param nombre El nombre de la tarea a completar.
     */
    public void completarTarea(String nombre) {
        ToDo t = encontrarTarea(nombre);
        if (t != null) {
            t.setCompletado(true);
            db.actualizar(t);
        }
    }

    /**
     * Busca una tarea específica en el almacén.
     * @param nombre Nombre identificador de la tarea.
     * @return La tarea encontrada o null.
     */
    public ToDo encontrarTarea(String nombre) {
        return db.leer(nombre);
    }

    /**
     * Guarda un email en la agenda del sistema.
     * @param email Dirección de correo.
     */
    public void guardarEmail(String email) {
        db.agregarEmail(email);
    }

    /**
     * @return Lista completa de todas las tareas del sistema.
     */
    public List<ToDo> obtenerTodos() {
        return db.getTodasLasTareas();
    }
}