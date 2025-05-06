package tech.liax;

public class App {
    public static void main(String[] args) {
        Estacao estacao = new Estacao();

        Dispositivo celular = new Dispositivo("Celular");
        Dispositivo painel = new Dispositivo("Painel Digital");

        estacao.adicionarObservador(celular);
        estacao.adicionarObservador(painel);

        estacao.novaLeitura("Temperatura: 25°C, Umidade: 60%");
        estacao.novaLeitura("Temperatura: 22°C, Umidade: 70%");

        estacao.removerObservador(celular);
        estacao.removerObservador(painel);
    }
}
