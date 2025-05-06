package tech.liax;

import java.util.ArrayList;
import java.util.List;

public class CentralAlarme {

    private List<Dispositivo> dispositivos = new ArrayList<>();

    public void registrarDispositivo(Dispositivo d) {
        dispositivos.add(d);
    }

    public void removerDispositivo(Dispositivo d) {
        dispositivos.remove(d);
    }

    public void notificarTodos(String alerta) {
        for (Dispositivo d : dispositivos) {
            d.alerta(alerta);
        }
    }

    public void disparar(String alerta) {
        System.out.println("⚠️ Alerta disparado: " + alerta);
        notificarTodos(alerta);
    }
}

