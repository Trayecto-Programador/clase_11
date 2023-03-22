/**
 * Ejercicio de If anidado
1) Un obrero necesita calcular su salario semanal, el cual se obtiene de la
siguiente. manera: A) - Si trabaja 40 horas o menos se le paga S/.16 por
hora. B) - Si trabaja más de 40 horas se le paga S/.16 por cada una de las
primeras 40 horas y S/.20 por cada hora extra.

 */
package actividad01;

import javax.swing.JOptionPane;

public class Actividad01 {

    public static void main(String[] args) {
        int cantidadHoraSemanal, valorHora1, valorHora2, totalAcobrar;
        
        cantidadHoraSemanal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de hora semanl realizada"));
        valorHora1 = 16;
        valorHora2 = 20;
        totalAcobrar = 0;
        
        if (cantidadHoraSemanal > 0 && cantidadHoraSemanal <=40) {
            totalAcobrar = cantidadHoraSemanal * valorHora1;
        } else {
            if(cantidadHoraSemanal >40){
                int horasExtra = cantidadHoraSemanal - 40;
                int horasNormales = 40;
                totalAcobrar = valorHora1 * horasNormales + valorHora2 * horasExtra;
            }
        }
        System.out.println("Total a cobrar semanal: " + totalAcobrar);
        }
        
    }
    

