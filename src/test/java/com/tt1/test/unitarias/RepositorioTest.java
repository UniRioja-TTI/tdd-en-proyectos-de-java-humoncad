package com.tt1.test.unitarias;

import com.tt1.test.DBStub;
import com.tt1.test.Repositorio;
import com.tt1.test.ToDo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepositorioTest {

    private Repositorio repo;
    private DBStub db;

    @BeforeEach
    void setUp() {
        db = new DBStub();
        repo = new Repositorio(db);
    }

    @Test
    void guardarTareaDebePasarPorRepo() {
        ToDo t = new ToDo();
        t.setNombre("RepoTest");
        // Act
        repo.guardarTarea(t);
        // Assert: Si no lanza excepción, verificamos tamaño
        assertEquals(1, db.getTodasLasTareas().size());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void guardarTarea() {
    }

    @Test
    void completarTarea() {
    }

    @Test
    void encontrarTarea() {
    }

    @Test
    void guardarEmail() {
    }

    @Test
    void obtenerTodos() {
    }
}