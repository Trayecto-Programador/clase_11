/**
 * Un comercio tiene sus ventas identificadas por un código, a saber:
 * •	Código 1 corresponde al sector ferretería,
 * •	Código 2 corresponde al sector pinturería,
 * •	Código 3 corresponde a ventas varias.
 * Ingresar el código de identificación (1, 2 o 3) y el importe vendido * para ese rubro.
 * El proceso finalizará cuando se ingrese un código 0 (cero).
 * Se solicita conocer la cantidad de ventas ingresadas,
 * el total vendido para cada código y la suma total de los importes.
 */
package practica01;

import javax.swing.JOptionPane;

public class Practica01 {

    public static void main(String[] args) {
        int codigoSector, importe, salida, cantidadVentas, totalVentas, totalFerreteria,
                totalPintureria, totalVarias, cantidadVentasFerreteria,
                cantidaVentasPintureria, cantidadVentasVarias;

        cantidadVentasFerreteria = 0;
        cantidaVentasPintureria = 0;
        cantidadVentasVarias = 0;

        totalFerreteria = 0;
        totalPintureria = 0;
        totalVarias = 0;

        cantidadVentas = 0;
        totalVentas = 0;

        do {
            codigoSector = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo de sector"));
            importe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Importe"));

            switch (codigoSector) {
                case 1:
                    cantidadVentas++;
                    cantidadVentasFerreteria++;
                    totalFerreteria = totalFerreteria + importe;
                    totalVentas = totalVentas + importe;
                    break;

                case 2:
                    cantidadVentas++;
                    cantidaVentasPintureria++;
                    totalPintureria = totalPintureria + importe;
                    totalVentas = totalVentas + importe;
                    break;

                case 3:
                    cantidadVentas++;
                    cantidadVentasVarias++;
                    totalVarias = totalVarias + importe;
                    totalVentas = totalVentas + importe;
                    break;

                default:
                    System.out.println("El codigo ingresado no corresponde a ningun Sector");
            }

            salida = Integer.parseInt(JOptionPane.showInputDialog("Salir de la carga con Cero"));
        } while (salida != 0);
        System.out.println("Cantidad Ventas ingresadas: " + cantidadVentas);

        System.out.println("<---Ferreteria--->");
        System.out.println("Total vendido codigo 1: " + totalFerreteria);
        System.out.println("Cantidad Ventas  codigo 1: " + cantidadVentasFerreteria + "\n");

        System.out.println("<---Pintureria--->");
        System.out.println("Total vendido codigo 2: " + totalPintureria);
        System.out.println("Cantidad Ventas  codigo 2: " + cantidaVentasPintureria + "\n");

        System.out.println("<---Varias--->");
        System.out.println("Total vendido codigo 3: " + totalVarias);
        System.out.println("Cantidad Ventas  codigo 3: " + cantidadVentasVarias + "\n");
    }

}
