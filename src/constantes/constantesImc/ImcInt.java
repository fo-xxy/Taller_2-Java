package constantes.constantesImc;

public enum ImcInt {
    DOS(2);

    private int valor;

    ImcInt(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
