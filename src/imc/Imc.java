package imc;
import static constantes.constantesSigno.SignoInt.ENTERO_CERO;
public class Imc {
    /*2: Se crean los atributos, en este caso es para el imc*/
    private double altura;
    private double peso;

    /*3: Se crea el constructor de los atributos*/
    public Imc(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    /*3.1: Este constructor no tiene parametros*/
    public Imc() {
        this.altura = ENTERO_CERO.getMensaje();
        this.peso = ENTERO_CERO.getMensaje();
    }

    /*4: Se crean los métodos Getter y Setter*/

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /*5: Creamos la clase hija*/
}
