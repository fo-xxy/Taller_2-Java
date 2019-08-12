package imc;
import static constantes.constantesImc.ImcInt.DOS;
/*6: Se hereda lo de la clase padre*/
public class ImcDao extends Imc {

    /*7: Se crea un método*/
    public double calcularImc(){
        return this.getPeso() /Math.pow(this.getAltura(),DOS.getValor()) ;
    }
    /*8: Creamos el package constantes*/


}
