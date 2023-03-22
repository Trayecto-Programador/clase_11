/**
 * Pedir dos números al usuario por teclado y decir que número es el mayor
 */
package actividad04;

import javax.swing.JOptionPane;

public class Actividad04 {

    public static void main(String[] args) {
        int numero1, numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero"));
        
        if(numero1 > numero2){
            System.out.println("El Primer valor ingresado " + numero1 + " es mayor al segundo numero ingresado " + numero2);
        }else{
            System.out.println("El Primer valor ingresado " + numero1 + " es menor al segundo numero ingresado " + numero2);
        }
    }

}
