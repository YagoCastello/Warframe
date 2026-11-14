package yago.castello.warframe.Model.Enums;

public enum NvSindicato {
    MENOS_DOIS(-2),
    MENOS_UM(-1),
    ZERO(0),
    UM(1),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5);
    private final int valor;


    NvSindicato(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
