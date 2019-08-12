package constantes.constantesImc;

public enum ImcString {
    /*9: Creamos las constantes*/
    MENSAJE_ALTURA("Ingresa tu altura en Metros: "),
    MENSAJE_PESO("Ingresa tu peso en kg: ");

    /*10: Se crea un atributo*/
    private String mensaje;

    /*11: Se crea el constructor de la clase*/
    ImcString(String mensaje) {
        this.mensaje = mensaje;
    }

    /*12: Se crea un método Getter*/
    public String getMensaje(){
        return mensaje;
    }

    /*13: Iremos al main */

}
