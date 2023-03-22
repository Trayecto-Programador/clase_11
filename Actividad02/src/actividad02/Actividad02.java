/**
 * Ejercicio de Bucle do while
 * 2) Ingresar artículo, precio unitario, cantidad, mostrar importe. No permitir
 * ingresar 0 en precio unitario y cantidad. En ese caso volver a pedir el
 * ingreso de precio unitario y/o de cantidad. Al finalizar mostrar artículo e
 * importe final.
 */
package actividad02;

import javax.swing.JOptionPane;

public class Actividad02 {

    public static void main(String[] args) {
        double cantidad, precioUnitario, importe;
        boolean salir;
        String articulo;

        articulo = JOptionPane.showInputDialog("Ingrese el nombre del articulo");

        do {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
            if (cantidad == 0) {
                salir = true;
            } else {
                salir = false;
            }
        } while (salir);

        do {
            precioUnitario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio"));
            if (precioUnitario == 0) {
                salir = true;
            }else{
                salir = false;
            }
        } while (salir);
        
        importe = precioUnitario * cantidad;
        System.out.println("Articulo: " + articulo);
        System.out.println("Importe Final: " + importe);
    }

}
