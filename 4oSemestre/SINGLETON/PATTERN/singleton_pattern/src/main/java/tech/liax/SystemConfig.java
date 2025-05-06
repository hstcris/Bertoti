package tech.liax;

public class SystemConfig {

    private static SystemConfig instancia = new SystemConfig();

    private String idioma = "pt-BR";
    private String tema = "escuro";

    private SystemConfig() {
    }

    public static SystemConfig getInstancia() {
        return instancia;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getTema() {
        return tema;
    }
}
