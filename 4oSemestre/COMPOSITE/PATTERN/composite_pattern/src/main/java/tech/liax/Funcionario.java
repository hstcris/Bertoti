package tech.liax;

public class Funcionario implements Componente {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String identacao) {
        System.out.println(identacao + "- Funcionário: " + nome);
    }
}

