/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practicaprogramada1;

import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class PracticaProgramada1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int numero;
        String cuatrimestre;
        int edad;

        String numeroLectura = JOptionPane.showInputDialog("Inserte un número del 1 al 12: ");
        numero = Integer.parseInt(numeroLectura);

        if (numero == 1) {
            System.out.println("El número corresponde al mes de enero");
        } else if (numero == 2) {
            System.out.println("El número corresponde al mes de febrero");
        } else if (numero == 3) {
            System.out.println("El número corresponde al mes de marzo");
        } else if (numero == 4) {
            System.out.println("El número corresponde al mes de abril");
        } else if (numero == 5) {
            System.out.println("El número corresponde al mes de mayo");
        } else if (numero == 6) {
            System.out.println("El número corresponde al mes de junio");
        } else if (numero == 7) {
            System.out.println("El número corresponde al mes de julio");
        } else if (numero == 8) {
            System.out.println("El número corresponde al mes de agosto");
        } else if (numero == 9) {
            System.out.println("El número corresponde al mes de septiembre");
        } else if (numero == 10) {
            System.out.println("El número corresponde al mes de octubre");
        } else if (numero == 11) {
            System.out.println("El número corresponde al mes de noviembre");
        } else if (numero == 12) {
            System.out.println("El número corresponde al mes de diciembre");

        }

        if (numero == 1 || numero == 2 || numero == 3 || numero == 4) {
            System.out.print("El mes corresponde al primer cuatrimestre");
        } else if (numero == 5 || numero == 6 || numero == 7 || numero == 8) {
            System.out.print("El mes corresponde al segundo cuatrimestre");
        } else if (numero == 9 || numero == 10 || numero == 11 || numero == 12) {
            System.out.print("El mes corresponde al tercer cuatrimestre");
        }
        
        String edadLectura = JOptionPane.showInputDialog("Inserte su edad: ");
        edad= Integer.parseInt(edadLectura);
        
        if (edad <= 5){
            System.out.print(" La edad corresponde a la Primera Infancia");
        }else if (edad <= 11){
            System.out.print(" La edad corresponde a la Infancia");
        }else if (edad <= 18){
            System.out.print(" La edad corresponde a la Adolescencia");
        }else if (edad <= 29){
            System.out.print(" La edad corresponde a la Juventud");
        }else if (edad <= 59){
            System.out.print(" La edad corresponde a la Adultez");
        }else if (edad >= 60){
            System.out.print(" La edad corresponde a Persona Mayor");
        
        }
        
        }


}