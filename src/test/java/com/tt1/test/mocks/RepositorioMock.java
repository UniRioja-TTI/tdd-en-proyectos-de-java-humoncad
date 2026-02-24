package com.tt1.test.mocks;

import com.tt1.test.Repositorio;
import com.tt1.test.ToDo;
import java.util.ArrayList;
import java.util.List;

public class RepositorioMock extends Repositorio {
    private List<ToDo> tareasSimuladas = new ArrayList<>();

    public RepositorioMock() {
        super(null);
    }

    public void simularDatos(List<ToDo> tareas) {
        this.tareasSimuladas = tareas;
    }

    @Override
    public List<ToDo> obtenerTodos() {
        return tareasSimuladas;
    }

    @Override
    public void guardarTarea(ToDo tarea) {
        tareasSimuladas.add(tarea);
    }
}