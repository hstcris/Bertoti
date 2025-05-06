package tech.liax;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();

        carro.movimentar();
        bicicleta.movimentar();
    }
}
