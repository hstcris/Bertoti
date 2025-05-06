package tech.liax;

public class App {
    public static void main(String[] args) {
        CentralAlarme central = new CentralAlarme();
        Alarme alarme1 = new Alarme("Alarme Sala", central);
        Alarme alarme2 = new Alarme("Alarme Cozinha", central);

        central.registrarDispositivo(alarme1);
        central.registrarDispositivo(alarme2);

        central.disparar("Movimento detectado na porta dos fundos");

        central.removerDispositivo(alarme1);
        central.removerDispositivo(alarme2);
    }
}
