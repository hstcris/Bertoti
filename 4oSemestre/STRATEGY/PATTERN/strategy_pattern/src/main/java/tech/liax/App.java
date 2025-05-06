package tech.liax;

public class App {
    public static void main(String[] args) {
        Instrumento violao = new Violao();
        Instrumento bateria = new Bateria();

        violao.tocarSom();
        bateria.tocarSom();
    }
}
