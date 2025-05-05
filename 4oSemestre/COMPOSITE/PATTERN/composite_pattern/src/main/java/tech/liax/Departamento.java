package tech.liax;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements Componente {
    private String nomeDepartamento;
    private List<Componente> componentes = new ArrayList<>();

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public void adicionarComponente(Componente componente) {
        componentes.add(componente);
    }

    public void removerComponente(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public void exibir(String identacao) {
        System.out.println(identacao + "- Departamento: " + nomeDepartamento);
        for (Componente componente : componentes) {
            componente.exibir(identacao + " ");
        }
    }
}
