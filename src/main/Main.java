package main;

import imc.ImcDao;
import salarios.SalarioDao;
import signoZodiacal.SignoZodiacalDao;
import vectorParOImpar.Vector;
import vectorParOImpar.VectorDao;

import javax.swing.*;

import static constantes.constantesImc.ImcString.MENSAJE_ALTURA;
import static constantes.constantesImc.ImcString.MENSAJE_PESO;
import static constantes.MainString.*;

public class Main {
    /*1: Creamos un package y una clase referente a lo que vamos a trabajar */

    /*14: Creamos el método principal*/
    public static void main(String[] args){
    /*15: Instanciamos la clse hija*/
        ImcDao imcDao = new ImcDao();
        SignoZodiacalDao signoZodiacalDao = new SignoZodiacalDao();
        SalarioDao salarioDao = new SalarioDao();


        /*Aqui iba el paso 16 en adelante, pero se implementó el menu y
        * los pasos se haran en cada caso, empezando con el caso 1, 2, 3, 4*/
        boolean salir = false;
        int opc;

        while(!salir){

            String valor = JOptionPane.showInputDialog(null, MENSAJE_1_MAIN.getMensaje() + "\n" + MENSAJE_2_MAIN.getMensaje() + "\n" + MENSAJE_3_MAIN.getMensaje()+ "\n" +  MENSAJE_4_MAIN.getMensaje() + "\n" +  MENSAJE_5_MAIN.getMensaje());
            opc = Integer.parseInt(valor);

            switch (opc){
                case 1:
                    /*16: Pedimos que ingresen los datos, pero primero agregamos la libreria swing y las constantes*/
                    String altura = JOptionPane.showInputDialog(null, MENSAJE_ALTURA.getMensaje());
                    String peso = JOptionPane.showInputDialog(null,MENSAJE_PESO.getMensaje());

                    /*17: Se llama al metodo set con el objeto de la clase*/
                    imcDao.setAltura(Double.parseDouble(altura));
                    imcDao.setPeso(Double.parseDouble(peso));

                    /*18: Se muestra el resultado*/
                    JOptionPane.showMessageDialog(null,imcDao.calcularImc());
                    break;
                case 2:
                    /*La parte logica de este caso se hizo desde su respectiva clase hija*/
                    signoZodiacalDao.calcularSigno();

                    break;
                case 3:
                    /*La parte logica de este caso se hizo desde su respectiva clase hija*/
                    salarioDao.calcularPromedioSalario();
                    break;
                case 4:
                    VectorDao vectorDao = new VectorDao();
                    vectorDao.par_O_Impar();
                    break;
                case 0:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, MENSAJE_6_FINAL.getMensaje());
                        break;

            }
        }
    }
}
