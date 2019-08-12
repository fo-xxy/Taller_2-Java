package salarios;
import static constantes.constantesSigno.SignoInt.ENTERO_CERO;
public class Salario {
    /*Los mismos pasos*/

    private double salarios;
    private double may;
    private double men;

    public Salario() {
        this.salarios = ENTERO_CERO.getMensaje();
        this.may = ENTERO_CERO.getMensaje();
        this.men = ENTERO_CERO.getMensaje();
    }

    public double getSalarios() {
        return salarios;
    }

    public void setSalarios(double salarios) {
        this.salarios = salarios;
    }

    public double getMay() {
        return may;
    }

    public void setMay(double may) {
        this.may = may;
    }

    public double getMen() {
        return men;
    }

    public void setMen(double men) {
        this.men = men;
    }
}
