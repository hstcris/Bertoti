package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    private String nome;
    private String plataforma;
    private boolean disponivel;

    public Jogo(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
        this.disponivel = true;
    }

    public String getNome() {
        return nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void alugar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }
}
