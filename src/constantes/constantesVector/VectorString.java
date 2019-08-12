package constantes.constantesVector;

public enum VectorString {

    MENSAJE_PETICION_1("Ingresa el total de los números a ingresar"),
    MENSAJE_PETICION_2("ingresa un numero"),
    MENSAJE_PROMEDIO_POSITIVOS("El promedio de los numeros positivos es: "),
    MENSAJE_PROMEDIO_NEGATIVOS("El promedio de los numeros negativos es: ");

    String mensaje;

    VectorString(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
