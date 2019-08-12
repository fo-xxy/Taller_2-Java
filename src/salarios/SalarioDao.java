package salarios;
import static constantes.constantesSigno.SignoInt.ENTERO_CERO;
import static constantes.constantesSigno.SignoInt.ENTERO_UNO;
import static constantes.constantesSalario.SalarioString.*;
import javax.swing.*;

/*Los mismos pasos*/
public class SalarioDao extends Salario {

    /*Se crea un metodo*/

        int respuesta = ENTERO_CERO.getMensaje();
        double acom = ENTERO_CERO.getMensaje();
        int cont = ENTERO_CERO.getMensaje();
        double promedio = ENTERO_CERO.getMensaje();

        public void calcularPromedioSalario(){
            boolean rtaa = false;
            while (!rtaa) {

                respuesta = Integer.parseInt(JOptionPane.showInputDialog(null,MENSAJE_1_PREGUNTA.getMensaje(), MENSAJE_TITULO.getMensaje(), JOptionPane.YES_NO_OPTION));

                if(respuesta == ENTERO_UNO.getMensaje()){
                    String salario = JOptionPane.showInputDialog(null, MENSAJE_PETICION.getMensaje());

                    this.setSalarios(Double.parseDouble(salario));

                    acom = acom + this.getSalarios();
                    cont++;
                    this.setSalarios(this.getSalarios());

                    if(this.getSalarios() > this.getMay()){
                        this.setMay(this.getSalarios());
                    }
                    else if(this.getSalarios() < this.getMay()){
                        this.setMen(this.getSalarios());
                    }
                }
                else if(respuesta == ENTERO_CERO.getMensaje()){
                    promedio = acom/cont;
                    JOptionPane.showMessageDialog(null, MENSAJE_1_RESULTADO.getMensaje()  + this.getMay() + "\n" + MENSAJE_2_RESULTADO.getMensaje() + this.getMen() + "\n" +  MENSAJE_3_RESULTADO.getMensaje()+ this.promedio);
                    rtaa = true;
                }
            }
        }
}
