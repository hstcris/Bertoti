package org.example;

public class CadastrarCliente {
    private String nome;
    private int idade;

    public CadastrarCliente (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

