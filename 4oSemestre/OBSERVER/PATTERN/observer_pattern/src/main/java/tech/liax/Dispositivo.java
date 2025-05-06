package tech.liax;

public class Dispositivo implements Observer {

    private String nome;

    public Dispositivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println(nome + " recebeu atualização do clima: " + mensagem);
    }
}
