package tech.liax;

public class Bateria implements Instrumento {
    @Override
    public void tocarSom() {
        System.out.println("Som da bateria: tum tum pá");
    }
}
