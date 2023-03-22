/**
 * Ejercicio de switch
 * 3) Se ingresa un valor por teclado y la cantidad de cuotas que quiere (2,
 * 6,12,24). Se pide que calcule cuotas según la siguiente tabla, la cual se
 * mostrará por pantalla:
 *  2 cuotas de $ …… total $ ……. (5%)
 *  6 cuotas de $ …… total $ ……. (12 %)
 *  12 cuotas de $ …… total $ ……. (20 %)
 */
package actividad03;

import javax.swing.JOptionPane;

public class Actividad03 {

    public static void main(String[] args) {
        int valor, cuotas;
        double total, recargo, importeCuota;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el importe"));
        cuotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de cuotas 2, 6, 12, 24"));
        
        switch(cuotas){
            case 2:
                recargo = valor * 0.05;
                importeCuota = (valor + recargo) / cuotas;
                total = valor + recargo;
                System.out.println(" " +  cuotas + " cuotas de $ " + importeCuota+  " total $ " + total + " (5%)");
                break;
           case 6:
                recargo = valor * 0.12;
                importeCuota = (valor + recargo) / cuotas;
                total = valor + recargo;
                System.out.println(" " +  cuotas + " cuotas de $ " + importeCuota+  " total $ " + total + " (12%)");
                break;
                
           case 12:
                recargo = valor * 0.2;
                importeCuota = (valor + recargo) / cuotas;
                total = valor + recargo;
                System.out.println(" " +  cuotas + " cuotas de $ " + importeCuota+  " total $ " + total + " (20%)");
                break;
            
           default:
               System.out.println("Pregunte % de financiamiento con su vendedor");
        }
        
    }

}
