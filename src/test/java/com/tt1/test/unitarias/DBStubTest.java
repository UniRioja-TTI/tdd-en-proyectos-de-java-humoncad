package com.tt1.test.unitarias;

import com.tt1.test.DBStub;
import com.tt1.test.ToDo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DBStubTest {

    private DBStub db;

    @BeforeEach
    void setUp() {
        db = new DBStub();
    }

    @Test
    void crearDebeAlmacenarTarea() {
        // Arrange
        ToDo t = new ToDo();
        t.setNombre("Tarea DB");

        // Act & Assert
        assertDoesNotThrow(() -> db.crear(t));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void crear() {
    }

    @Test
    void leer() {
    }

    @Test
    void actualizar() {
    }

    @Test
    void borrar() {
    }

    @Test
    void getTodasLasTareas() {
    }

    @Test
    void getAgendaEmails() {
    }

    @Test
    void agregarEmail() {
    }
}