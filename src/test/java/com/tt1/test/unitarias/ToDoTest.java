package com.tt1.test.unitarias;

import com.tt1.test.ToDo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToDoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testFuncionamientoBaseJavaBean() {
        // Arrange
        ToDo tarea = new ToDo();
        LocalDate fecha = LocalDate.now();

        // Act
        tarea.setNombre("Test");
        tarea.setFechaLimite(fecha);

        // Assert
        assertEquals("Test", tarea.getNombre());
        assertEquals(fecha, tarea.getFechaLimite());
    }

    @Test
    void getNombre() {
    }

    @Test
    void setNombre() {
    }

    @Test
    void getDescripcion() {
    }

    @Test
    void setDescripcion() {
    }

    @Test
    void getFechaLimite() {
    }

    @Test
    void setFechaLimite() {
    }

    @Test
    void isCompletado() {
    }

    @Test
    void setCompletado() {
    }
}