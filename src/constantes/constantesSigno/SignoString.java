package constantes.constantesSigno;

public enum SignoString {
    MENSAJE_1_ADVERTENCIA("Recuerda que debes ingresar un Día y Mes de calendario, sino serás redireccionado al menú principal"),
    MENSAJE_2_PETICION("Ingresa su Día de nacimiento"),
    MENSAJE_3_PETICION("Ingresa su Mes de nacimiento"),
    MENSAJE_4_ADVERTENCIA("Ingresa un día de calendario. Gracias."),
    MENSAJE_5_ADVERTENCIA("Ingresa un Mes de calendario. Gracias."),
    MENSAJE_SIGNO_1("Aries"),
    MENSAJE_SIGNO_2("Tauro"),
    MENSAJE_SIGNO_3("Géminis"),
    MENSAJE_SIGNO_4("Cáncer"),
    MENSAJE_SIGNO_5("Leo"),
    MENSAJE_SIGNO_6("Virgo"),
    MENSAJE_SIGNO_7("Libra"),
    MENSAJE_SIGNO_8("Escorpio"),
    MENSAJE_SIGNO_9("Sagitario"),
    MENSAJE_SIGNO_10("Capricornio"),
    MENSAJE_SIGNO_11("Acuario"),
    MENSAJE_SIGNO_12("Piscis");


    String mensaje;

    SignoString(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
