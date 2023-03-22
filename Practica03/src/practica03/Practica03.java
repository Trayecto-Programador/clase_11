/**
 * En un Hospital se necesitan controlar los montos recaudados
 * por analisis de los pacientes durante un dia completo de atencion,
 * los precios de los analisis son como se indica:
 *  Tipo de analisis 1: $ 300
 *  Tipo de analisis 2: $ 400
 *  Tipo de analisis 3: $ 350
 * Ademas se determina que los pacientes con edad entre 14 y 22 años
 * implican un costo adicional de 10%
 * y si la atencion es un dia no laborable implica un adicional del 15%.
 * Implementar una aplicacion que permita calcular y mostrar el costo total
 * que representa los analisis durante el dia en el hospital
 */
package practica03;

import javax.swing.JOptionPane;

public class Practica03 {

    public static void main(String[] args) {
        int tipoAnalisis, costo1, costo2, costo3, edad;
        String dia, continuar;
        double adicionalEdad, adicionalDia, costoTotal, costoAnalisis, totalDia;

        costo1 = 300;
        costo2 = 400;
        costo3 = 350;
        adicionalEdad = 0.1;
        adicionalDia = 0.15;
        costoAnalisis = 0;
        costoTotal = 0;
        totalDia = 0;
        dia = "";
        continuar = "";

        do {
            tipoAnalisis = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Tipo de analisis"));

            switch (tipoAnalisis) {
                case 1:
                    costoAnalisis = costoAnalisis + costo1;
                    break;

                case 2:
                    costoAnalisis = costoAnalisis + costo2;
                    break;

                case 3:
                    costoAnalisis = costoAnalisis + costo3;
                    break;

                default:
                    System.out.println("Tipo de analisis invalido");
            }

            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
            if (edad >= 14 && edad <= 22) {
                costoTotal = costoAnalisis + costoAnalisis * adicionalEdad;
                System.out.println("Adicional Edad: " + costoAnalisis * adicionalEdad);
            } else {
                costoTotal = costoAnalisis;
            }

            dia = JOptionPane.showInputDialog("Ingrese dia de la semana");
            if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("Domingo")) {
                costoTotal = costoTotal + costoAnalisis * adicionalDia;
                System.out.println("Adicional dia no laborable: " + costoAnalisis * adicionalDia);
            }

            System.out.println("Importe Analisis: " + costoAnalisis);
            System.out.println("Total abonar: " + costoTotal + "\n");
            totalDia = totalDia + costoTotal;
            continuar = JOptionPane.showInputDialog("Desea Continuar Si / No");
            costoAnalisis = 0;
            costoTotal = 0;
        } while (continuar.equalsIgnoreCase("si"));
        System.out.println("Importe Final Diario: " + totalDia);
    }

}
