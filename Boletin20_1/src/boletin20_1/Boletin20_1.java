package boletin20_1;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Boletin20_1 {

    public static void main(String[] args) {
        Metodos obx=new Metodos();
        int fila,columna;
        fila=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca numero de equipos"));
        columna=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca numero de jornadas"));
        String[]equipo=new String[fila];
        String[]jornada=new String[columna];
        int[][]goles=new int[equipo.length][jornada.length];
        int[]golesTotal=new int[equipo.length];
        
        obx.crearTablaEquipo(equipo);
        obx.crearTablaJornada(jornada);
        obx.crearTablaGoles(goles, equipo, jornada);
        obx.mostraTabla(goles, equipo, jornada);
        obx.ordenarEquipos(goles, equipo, golesTotal);
        obx.totalGolesEquipo(equipo, golesTotal);
        obx.mostraTablaOrdenada(goles, equipo, jornada, golesTotal);
        obx.buscarCantidadGolesEnJornada(equipo, jornada, goles);
        obx.consultar(equipo, jornada, goles);
    }
    
}
