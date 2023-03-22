/**
 * Una tienda ofrece un descuento del 15% sobre el total de la compra y un
cliente desea saber cuánto deberá pagar finalmente por su compra
 */
package actividad07;

import javax.swing.JOptionPane;

public class Actividad07 {

    public static void main(String[] args) {
         double importeCompra, totalImporte, descuento;
        
        
        importeCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el importe de su compra"));
        descuento = 0.15;
        totalImporte = 0;
        
        totalImporte = importeCompra - importeCompra * descuento;
        
        System.out.println("Imoprte de la compra: " + importeCompra);
        System.out.println("Descuento: " + importeCompra * descuento);
        System.out.println("Total de su compra: " + totalImporte );
        
    }
    
}
