package constantes.constantesSalario;

public enum SalarioString {
    MENSAJE_TITULO("Proceso"),
    MENSAJE_1_PREGUNTA("Desea ingresar un salario? Si = 1 No = 2"),
    MENSAJE_PETICION("ingresa un salario"),
    MENSAJE_1_RESULTADO("El salario maximo es: "),
    MENSAJE_2_RESULTADO("El salario mas bajo es: "),
    MENSAJE_3_RESULTADO("El promedio de salarios ingresados es: ");


    String mensaje;

    SalarioString(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
