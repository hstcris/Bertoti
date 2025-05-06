package tech.liax;

public class App {
    public static void main(String[] args) {
        SystemConfig config1 = SystemConfig.getInstancia();
        SystemConfig config2 = SystemConfig.getInstancia();

        System.out.println("Idioma do sistema: " + config1.getIdioma());
        System.out.println("Tema do sistema: " + config1.getTema());

        if (config1 == config2) {
            System.out.println("config1 e config2 são a mesma instância (Singleton confirmado)");
        } else {
            System.out.println("São instâncias diferentes");
        }
    }
}
