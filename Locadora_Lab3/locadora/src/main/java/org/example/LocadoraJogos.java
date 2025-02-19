package org.example;

import java.util.ArrayList;

public class LocadoraJogos {
    private ArrayList<Jogo> jogos;

    public LocadoraJogos() {
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
    }

    public void alugarJogo(String nome) {
        for (Jogo jogo : jogos) {
            if (jogo.getNome().equalsIgnoreCase(nome) && jogo.estaDisponivel()) {
                jogo.alugar();
                System.out.println("Jogo " + nome + " alugado com sucesso!");
                return;
            }
        }
        System.out.println("Desculpe, o jogo " + nome + " não está disponível para aluguel.");
    }

    public void devolverJogo(String nome) {
        for (Jogo jogo : jogos) {
            if (jogo.getNome().equalsIgnoreCase(nome) && !jogo.estaDisponivel()) {
                jogo.devolver();
                System.out.println("O jogo " + nome + " foi devolvido com sucesso!");
                return;
            }
        }
        System.out.println("Você não tem o jogo " + nome + " para devolver.");
    }

    public void listarJogosDisponiveis() {
        System.out.println("Jogos disponíveis para aluguel:");
        for (Jogo jogo : jogos) {
            if (jogo.estaDisponivel()) {
                System.out.println(jogo.getNome() + " - Plataforma: " + jogo.getPlataforma());
            }
        }
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }

    public <Cliente> void adicionarCliente(Cliente cliente) {
    }
}

