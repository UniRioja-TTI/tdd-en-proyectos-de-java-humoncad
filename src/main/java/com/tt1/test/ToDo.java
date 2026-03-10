package com.tt1.test;

import java.time.LocalDate;


/**
 * ToDo sirve para representar una tarea o elemento de la lista de tareas pendientes.
 * Esta clase actúa como un javabean para transportar los datos de la tarea.
 */
public class ToDo {
    private String nombre;
    private String descripcion;
    private LocalDate fechaLimite;
    private boolean completado;

    public ToDo() {}

    /** @return El nombre o título de la tarea */
    public String getNombre() { return nombre; }

    /** @param nombre El nuevo nombre para la tarea */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return La descripción detallada de la tarea */
    public String getDescripcion() { return descripcion; }

    /** @param descripcion Detalle de lo que se debe realizar */
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    /** @return La fecha límite para completar la tarea */
    public LocalDate getFechaLimite() { return fechaLimite; }

    /** @param fechaLimite Fecha limite en formato LocalDate */
    public void setFechaLimite(LocalDate fechaLimite) { this.fechaLimite = fechaLimite; }

    /** @return true si la tarea ya ha sido finalizada */
    public boolean isCompletado() { return completado; }

    /** @param completado, estado de finalización de la tarea */
    public void setCompletado(boolean completado) { this.completado = completado; }
}