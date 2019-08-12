package vectorParOImpar;
import static constantes.constantesSigno.SignoInt.ENTERO_CERO;
import static constantes.constantesSigno.SignoInt.ENTERO_UNO;
import static constantes.constantesVector.VectorString.*;
import javax.swing.*;

public class VectorDao extends Vector{


    public void par_O_Impar(){
        int contaPos = ENTERO_CERO.getMensaje();
        int contaNeg = ENTERO_CERO.getMensaje();
        double acomPos = ENTERO_CERO.getMensaje();
        double acomNeg = ENTERO_CERO.getMensaje();
        int i ;
        int num ;
        this.setVector(Integer.parseInt(JOptionPane.showInputDialog(null, MENSAJE_PETICION_1.getMensaje() )));

        double[] numerosPos = new double[this.getVector()];
        double[] numerosNeg = new double[this.getVector()];

        for( i = ENTERO_CERO.getMensaje(); i < this.getVector() ; i++) {
            num=(Integer.parseInt(JOptionPane.showInputDialog(null, MENSAJE_PETICION_2.getMensaje() )));

            if (num < ENTERO_CERO.getMensaje()) {
                numerosNeg[i] = num;
                contaNeg = contaNeg + ENTERO_UNO.getMensaje();
            } else {
                numerosPos[i] = num;
                contaPos = contaPos + ENTERO_UNO.getMensaje();

            }
        }
        this.setPos(contaPos);
        this.setNeg(contaNeg);
            for( i=ENTERO_CERO.getMensaje(); i<this.getVector(); i++){
                acomPos = acomPos + numerosPos[i];
                acomNeg = acomNeg + numerosNeg[i];

            }
            JOptionPane.showMessageDialog(null, MENSAJE_PROMEDIO_POSITIVOS.getMensaje() + (acomPos/this.getPos()) +"\n"+ MENSAJE_PROMEDIO_NEGATIVOS.getMensaje() + (acomNeg/this.getNeg())  );

    }
}
