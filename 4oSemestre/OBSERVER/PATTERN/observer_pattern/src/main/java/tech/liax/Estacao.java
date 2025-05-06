package tech.liax;

import java.util.ArrayList;
import java.util.List;

public class Estacao {

    private List<Observer> observadores = new ArrayList<>();

    public void adicionarObservador(Observer o) {
        observadores.add(o);
    }

    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    public void notificarObservadores(String mensagem) {
        for (Observer o : observadores) {
            o.update(mensagem);
        }
    }

    public void novaLeitura(String dadosClimaticos) {
        System.out.println("Estação registrou: " + dadosClimaticos);
        notificarObservadores(dadosClimaticos);
    }
}
