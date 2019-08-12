package signoZodiacal;

import static constantes.constantesSigno.SignoInt.*;
import static constantes.constantesSigno.SignoString.*;
import javax.swing.*;
import java.awt.*;

/*Los mismos pasos que la clase Imc, primero se hereda lo de la clase padre*/
public class SignoZodiacalDao extends SignoZodiacal{

        boolean rtaa = false;
        int auxDia = ENTERO_CERO.getMensaje();
        int auxMes = ENTERO_CERO.getMensaje();
    /*Se crea un método*/

    public void calcularSigno(){
        JOptionPane.showMessageDialog(null, MENSAJE_1_ADVERTENCIA.getMensaje() );
        auxDia = Integer.parseInt(JOptionPane.showInputDialog(null, MENSAJE_2_PETICION.getMensaje() ));
        auxMes = Integer.parseInt(JOptionPane.showInputDialog(null, MENSAJE_3_PETICION.getMensaje()));

        setDia(auxDia);
        setMes(auxMes);

        if(this.getDia() > ENTERO_TREINTA_Y_UNO.getMensaje()){
            JOptionPane.showMessageDialog(null, MENSAJE_4_ADVERTENCIA.getMensaje());
        }

        if(this.getMes()== ENTERO_TRES.getMensaje() || this.getMes() == ENTERO_CUATRO.getMensaje()){
            this.signo1();
        }
        else if(this.getMes()== ENTERO_CUATRO.getMensaje() || this.getMes() == ENTERO_CINCO.getMensaje()){
            this.signo2();
        }
        else if(this.getMes()== ENTERO_CINCO.getMensaje() || this.getMes() == ENTERO_SEIS.getMensaje()){
            this.signo3();
        }
        else if(this.getMes() == ENTERO_SEIS.getMensaje() || this.getMes() == ENTERO_SIETE.getMensaje()){
            this.signo4();
        }
        else if(this.getMes() == ENTERO_SIETE.getMensaje() || this.getMes() == ENTERO_OCHO.getMensaje()){
            this.signo5();
        }
        else if(this.getMes() == ENTERO_OCHO.getMensaje() || this.getMes() == ENTERO_NUEVE.getMensaje()){
            this.signo6();
        }
        else{
            this.calcularSigno2();
        }
    }

    public void calcularSigno2(){
        if(this.getMes() == ENTERO_NUEVE.getMensaje() || this.getMes() == ENTERO_DIEZ.getMensaje()){
            this.signo7();
        }
        else if(this.getMes() == ENTERO_DIEZ.getMensaje() || this.getMes() == ENTERO_ONCE.getMensaje()){
            this.signo8();
        }
        else if(this.getMes() == ENTERO_ONCE.getMensaje() || this.getMes() == ENTERO_DOCE.getMensaje()){
            this.signo9();
        }
        else if(this.getMes() == ENTERO_DOCE.getMensaje() || this.getMes() == ENTERO_UNO.getMensaje()){
            this.signo10();
        }
        else if(this.getMes() ==ENTERO_UNO.getMensaje() || this.getMes() == ENTERO_DOS.getMensaje()){
            this.signo11();
        }
        else if(this.getMes() == ENTERO_DOS.getMensaje() || this.getMes() == ENTERO_TRES.getMensaje()){
            this.signo12();
        }
        else{
            JOptionPane.showMessageDialog(null,MENSAJE_5_ADVERTENCIA.getMensaje());
        }
    }

    public void signo1(){
        if( this.getMes() == ENTERO_TRES.getMensaje() && this.getDia() >= ENTERO_VEINTIUNO.getMensaje() && this.getDia() <= ENTERO_TREINTA_Y_UNO.getMensaje() || this.getMes() == ENTERO_CUATRO.getMensaje() && this.getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_VEINTE.getMensaje()){

            JOptionPane.showMessageDialog(null,MENSAJE_SIGNO_1.getMensaje());
        }
    }
    public void signo2(){
        if(this.getMes() == ENTERO_CUATRO.getMensaje() && this.getDia() >= ENTERO_VEINTIUNO.getMensaje() && this.getDia() <= ENTERO_TREINTA.getMensaje() || this.getMes() == ENTERO_CINCO.getMensaje() && this. getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_VEINTE.getMensaje()){
            JOptionPane.showMessageDialog(null,MENSAJE_SIGNO_2.getMensaje());
        }
    }

    public void signo3(){
        if(this.getMes() == ENTERO_CINCO.getMensaje() && this.getDia() >= ENTERO_VEINTIUNO.getMensaje() && this.getDia() <= ENTERO_TREINTA_Y_UNO.getMensaje() || this.getMes() == ENTERO_SEIS.getMensaje() && this. getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_VEINTIUNO.getMensaje()){
            JOptionPane.showMessageDialog(null,MENSAJE_SIGNO_3.getMensaje());
        }
    }

    public void signo4(){
        if(this.getMes() == ENTERO_SEIS.getMensaje() && this.getDia() >= ENTERO_VEINTIDOS.getMensaje() && this.getDia() <= ENTERO_TREINTA.getMensaje() || this.getMes() == ENTERO_SIETE.getMensaje() && this. getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_VEINTIDOS.getMensaje()){
            JOptionPane.showMessageDialog(null,MENSAJE_SIGNO_4.getMensaje());
        }
    }

    public void signo5(){
        if(this.getMes() == ENTERO_SIETE.getMensaje() && this.getDia() >= ENTERO_VEINTITRES.getMensaje() && this.getDia() <= ENTERO_TREINTA_Y_UNO.getMensaje() || this.getMes() == ENTERO_OCHO.getMensaje() && this. getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_VEINTITRES.getMensaje()){
            JOptionPane.showMessageDialog(null, MENSAJE_SIGNO_5.getMensaje());
        }
    }

    public void signo6(){
        if(this.getMes() == ENTERO_OCHO.getMensaje() && this.getDia() >= ENTERO_VEINTITRES.getMensaje() && this.getDia() <= ENTERO_TREINTA_Y_UNO.getMensaje() || this.getMes() == ENTERO_NUEVE.getMensaje() && this. getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_VEINTIDOS.getMensaje()){
            JOptionPane.showMessageDialog(null, MENSAJE_SIGNO_6.getMensaje());
        }
    }

    public void signo7(){
        if(this.getMes() == ENTERO_NUEVE.getMensaje() && this.getDia() >= ENTERO_VEINTITRES.getMensaje() && this.getDia() <= ENTERO_TREINTA.getMensaje() || this.getMes() == ENTERO_DIEZ.getMensaje() && this. getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_VEINTIDOS.getMensaje()){
            JOptionPane.showMessageDialog(null,  MENSAJE_SIGNO_7.getMensaje());
        }
    }

    public void signo8(){
        if(this.getMes() == ENTERO_DIEZ.getMensaje() && this.getDia() >= ENTERO_VEINTITRES.getMensaje() && this.getDia() <= ENTERO_TREINTA_Y_UNO.getMensaje()|| this.getMes() == ENTERO_ONCE.getMensaje() && this. getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_VEINTIDOS.getMensaje()){
            JOptionPane.showMessageDialog(null,MENSAJE_SIGNO_8.getMensaje()  );
        }
    }

    public void signo9(){
        if(this.getMes() == ENTERO_ONCE.getMensaje() && this.getDia() >= ENTERO_VEINTITRES.getMensaje() && this.getDia() <= ENTERO_TREINTA.getMensaje() || this.getMes() == ENTERO_DOCE.getMensaje() && this. getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_VEINTIUNO.getMensaje()){
            JOptionPane.showMessageDialog(null,MENSAJE_SIGNO_9.getMensaje() );
        }
    }

    public void signo10(){
        if(this.getMes() == ENTERO_DOCE.getMensaje() && this.getDia() >= ENTERO_VEINTIDOS.getMensaje() && this.getDia() <= ENTERO_TREINTA_Y_UNO.getMensaje() || this.getMes() == ENTERO_UNO.getMensaje() && this. getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_DIESINUEVE.getMensaje()){
            JOptionPane.showMessageDialog(null, MENSAJE_SIGNO_10.getMensaje() );
        }
    }

    public void signo11(){
        if(this.getMes() == ENTERO_UNO.getMensaje() && this.getDia() >= ENTERO_VEINTE.getMensaje() && this.getDia() <= ENTERO_TREINTA_Y_UNO.getMensaje()|| this.getMes() == ENTERO_DOS.getMensaje() && this. getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_DIESINUEVE.getMensaje()){
            JOptionPane.showMessageDialog(null,MENSAJE_SIGNO_11.getMensaje());
        }
    }

    public void signo12(){
        if(this.getMes() == ENTERO_DOS.getMensaje() && this.getDia() >= ENTERO_VEINTE.getMensaje() && this.getDia() <= ENTERO_VEINTINUEVE.getMensaje() || this.getMes() == ENTERO_TRES.getMensaje()  && this. getDia() > ENTERO_CERO.getMensaje() && this.getDia() <= ENTERO_VEINTE.getMensaje()){
            JOptionPane.showMessageDialog(null, MENSAJE_SIGNO_12.getMensaje() );
        }
    }



}
