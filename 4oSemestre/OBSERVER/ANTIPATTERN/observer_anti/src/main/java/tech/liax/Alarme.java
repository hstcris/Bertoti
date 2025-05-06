package tech.liax;

public class Alarme implements Dispositivo {

    private String nome;
    private CentralAlarme central;

    public Alarme(String nome, CentralAlarme central) {
        this.nome = nome;
        this.central = central;
        central.registrarDispositivo(this);
    }

    @Override
    public void alerta(String mensagem) {
        System.out.println(nome + " recebeu alerta: " + mensagem);
        central.disparar("Reação em cadeia: verificação de zona adicional");
    }
}
