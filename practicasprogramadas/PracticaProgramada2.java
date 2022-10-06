package com.mycompany.practicasprogramadas;

import javax.swing.JOptionPane;

public class PracticaProgramada2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        double tiempoVuelta;
        double promedioVuelta;
        double tiempoPITS;
        double tiempoPorcentaje;

        //Primer ejercicio//
        tiempoPorcentaje = 2;
        System.out.println("A continuación, por favor inserte la información solicitada para las 10 vueltas.");

        for (int i = 1; i < 6; i++) {
            String tiempoVueltaLectura = JOptionPane.showInputDialog("Inserte el tiempo (minutos) que tomó recorrer la vuelta " + i);
            tiempoVuelta = Double.parseDouble(tiempoVueltaLectura);
            String tiempoPITSLectura = JOptionPane.showInputDialog("Inserte el tiempo (minutos) que tomó en los PITS: ");
            tiempoPITS = Double.parseDouble(tiempoPITSLectura);
            
            promedioVuelta=tiempoVuelta+tiempoVuelta+i;
            
        System.out.println("Tiempo promedio por vuelta: "+promedioVuelta);
        }
       

        //Segundo ejercicio//
        int cantidadEstudiantes;
        String cantidadEstudiantesLec = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes: ");
        cantidadEstudiantes = Integer.parseInt(cantidadEstudiantesLec);
        int estatura1 = 0;
        int estatura2 = 0;
        int estatura3 = 0;
        int estatura4 = 0;
        int estatura5 = 0;
        int altura;
        int sumaEstaturas;

        for (int k = 1; k <= cantidadEstudiantes; k++) {
            String alturaLectura = JOptionPane.showInputDialog("Ingrese la estatura del estudiante " + k);
            altura = Integer.parseInt(alturaLectura);

            if (altura < 100) {
                estatura1 = estatura1 + 1;
            } else if (altura >= 100 && altura <= 120) {
                estatura2= estatura2+1;
            } else if (altura >= 121 && altura <= 130) {
                estatura3= estatura3+1;
            } else if (altura >= 131 && altura <= 140) {
                estatura4= estatura4+1;
            } else if (altura > 140) {
                estatura5= estatura5+1;
                
            
            sumaEstaturas = estatura1 + estatura2 + estatura3 + estatura4 + estatura5;
            
            
            System.out.println("Cantidad de alumnos que miden menos de 100cm: "+estatura1);
            System.out.println("Cantidad de alumnos que miden entre 100cm y 120 cm: "+estatura2);
            System.out.println("Cantidad de alumnos que miden entre 121cm y 130 cm: "+estatura3);
            System.out.println("Cantidad de alumnos que miden entre 131cm y 140 cm: "+estatura4);
            System.out.println("Cantidad de alumnos que miden más de 140 cm.: "+estatura5);
            System.out.println("El promedio de estatura corresponde a "+sumaEstaturas/cantidadEstudiantes);
            }
        }

            
            }

        }
