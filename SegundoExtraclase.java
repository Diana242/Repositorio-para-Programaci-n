/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.segundoextraclase;
import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class SegundoExtraclase {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int tiempo;
        double horas;
        double salarioSemanal;
        double horasPrecio;
        double salarioBruto;
        double bono;
        double deducciones;
        double salarioNeto;
        double salarioBono;
        int semanas;
        
        
        String tiempoLectura= JOptionPane.showInputDialog("Inserte la cantidad de años que lleva en la compañía: ");
        tiempo= Integer.parseInt(tiempoLectura);
        String horasLectura= JOptionPane.showInputDialog("Inserte la cantidad de horas laboradas por semana: ");
        horas= Double.parseDouble(horasLectura);
        String horasPrecioLectura= JOptionPane.showInputDialog("Inserte el monto pagado por hora:");
        horasPrecio= Integer.parseInt(horasPrecioLectura);
        
        salarioSemanal= horas*horasPrecio;
        String semanasLectura = JOptionPane.showInputDialog("Inserte la cantidad de semanas de este mes: ");
        semanas=Integer.parseInt(semanasLectura);
        
        salarioBruto= salarioSemanal*semanas;
        
        JOptionPane.showMessageDialog(null, "Salario bruto: " +salarioBruto);

        if (tiempo > 10) {
            bono = salarioBruto * 0.20;
            JOptionPane.showMessageDialog(null, "Bono: " + bono);
            salarioBono=salarioBruto+bono;
            JOptionPane.showMessageDialog(null, "Salario con bono: " + salarioBono);
            if (bono > 1000) {
                deducciones = salarioBono - 0.10;
                salarioNeto= salarioBono-deducciones;
                JOptionPane.showMessageDialog(null, "Salario neto: " + salarioNeto);
                if (bono > 2000) {
                    deducciones = salarioBono - 0.15;
                    salarioNeto= salarioBono-deducciones;
                    JOptionPane.showMessageDialog(null, "Salario neto: " + salarioNeto);
                }
            }

        }
    }
}
