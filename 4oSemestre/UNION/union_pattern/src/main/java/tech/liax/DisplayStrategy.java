package tech.liax;

// Estratégia para exibição dos dados
public interface DisplayStrategy {
    void display(String temperature, String humidity, String pressure);
}

// Exibição em formato de texto
public class TextDisplayStrategy implements DisplayStrategy {
    @Override
    public void display(String temperature, String humidity, String pressure) {
        System.out.println("Temperatura: " + temperature);
        System.out.println("Umidade: " + humidity);
        System.out.println("Pressão: " + pressure);
    }
}

// Exibição em formato gráfico (exemplo simples)
public class GraphDisplayStrategy implements DisplayStrategy {
    @Override
    public void display(String temperature, String humidity, String pressure) {
        System.out.println("Exibindo gráfico com dados: ");
        System.out.println("Temperatura: " + temperature);
        System.out.println("Umidade: " + humidity);
        System.out.println("Pressão: " + pressure);
    }
}
