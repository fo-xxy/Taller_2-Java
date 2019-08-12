package signoZodiacal;
import static constantes.constantesSigno.SignoInt.ENTERO_CERO;
public class SignoZodiacal {
    /*Seria los mismos pasos del package imc, primero los atributos*/
    private int dia;
    private int mes;


    /*se crea un cpnstructor*/

    public SignoZodiacal() {
        this.dia = ENTERO_CERO.getMensaje();
        this.mes = ENTERO_CERO.getMensaje();
    }

    public SignoZodiacal(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    /*se crea un método getter y setter*/

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}
