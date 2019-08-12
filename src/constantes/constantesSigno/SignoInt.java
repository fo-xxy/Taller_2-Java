package constantes.constantesSigno;

public enum SignoInt {
    ENTERO_TREINTA_Y_UNO(31),
    ENTERO_TREINTA(30),
    ENTERO_VEINTINUEVE(29),
    ENTERO_VEINTITRES(23),
    ENTERO_VEINTIDOS(22),
    ENTERO_VEINTIUNO(21),
    ENTERO_VEINTE(20),
    ENTERO_DIESINUEVE(19),
    ENTERO_DOCE(12),
    ENTERO_ONCE(11),
    ENTERO_DIEZ(10),
    ENTERO_NUEVE(9),
    ENTERO_OCHO(8),
    ENTERO_SIETE(7),
    ENTERO_SEIS(6),
    ENTERO_CINCO(5),
    ENTERO_CUATRO(4),
    ENTERO_TRES(3),
    ENTERO_DOS(2),
    ENTERO_UNO(1),
    ENTERO_CERO(0);


    int mensaje;

    SignoInt(int mensaje) {
        this.mensaje = mensaje;
    }

    public int getMensaje() {
        return mensaje;
    }
}
