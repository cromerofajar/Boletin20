package boletin20_2;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Boletin20_2 {

    public static void main(String[] args) {
        Metodos obx=new Metodos();
        int filas=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca numero de filas"));
        obx.piramide(filas);
    }
    
}
