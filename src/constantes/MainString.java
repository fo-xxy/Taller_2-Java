package constantes;

public enum MainString {
    MENSAJE_1_MAIN("1: Calcular el Imc "),
    MENSAJE_2_MAIN("2: Signo Zodiacal"),
    MENSAJE_3_MAIN("3: Registro salarios"),
    MENSAJE_4_MAIN(" 4: Vector de números "),
    MENSAJE_5_MAIN("0: Salir"),
    MENSAJE_6_FINAL("Ingrese un numero que corresponda al menú");

    String mensaje;

    MainString(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
