/**
 * En un almacén se hace un 20% de descuento a los clientes cuya compra
supere los S/.1000 ¿Cuál será la cantidad que pagara una persona por su
compra?
 */
package actividad05;

import javax.swing.JOptionPane;

public class Actividad05 {

    public static void main(String[] args) {
        int compra, importe, compraDescuento;
        double descuento, importeTotal;
        
        importe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el importe de su compra"));
        descuento = 0.20;
        compraDescuento = 1000;
        importeTotal = 0;
        
        if(importe > compraDescuento){
            importeTotal = importe - importe * descuento;
        }else{
            importeTotal = importe;
        }
        System.out.println("El Importe de su compra es: "+ importeTotal);
    }
    
}
