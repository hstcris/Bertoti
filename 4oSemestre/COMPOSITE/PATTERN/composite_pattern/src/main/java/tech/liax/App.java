package tech.liax;

public class App {
    public static void main(String[] args) {
        Componente funcionario1 = new Funcionario("Mark Scout");
        Componente funcionario2 = new Funcionario("Helly R");
        Componente funcionario3 = new Funcionario("Seth Milchick");

        Departamento dev = new Departamento("Macro dados");
        dev.adicionarComponente(funcionario1);
        dev.adicionarComponente(funcionario2);

        Departamento ti = new Departamento("TI");
        ti.adicionarComponente(funcionario3);
        ti.adicionarComponente(dev);

        System.out.println("Departamento Desenvolvimento:");
        dev.exibir(" ");

        System.out.println("\nDepartamento TI:");
        ti.exibir(" ");
    }
}
