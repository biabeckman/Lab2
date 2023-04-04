package lp2;

public class Resumo {
    private String tema;
    private String texto;

    public Resumo(String tema, String texto) {
        this.tema = tema;
        this.texto = texto;
    }

    public String getTema() {
        return tema;
    }

    public String getTexto() {
        return texto;
    }
}
