package tech.liax;

public class Violao implements Instrumento {
    @Override
    public void tocarSom() {
        System.out.println("Som do violão: plim plim");
    }
}

