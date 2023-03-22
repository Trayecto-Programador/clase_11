/**
 * Se requiere determinar el sueldo semanal de un trabajador con base en
las horas que trabaja y el pago por hora que recibe

 */
package actividad06;

import javax.swing.JOptionPane;

public class Actividad06 {

    public static void main(String[] args) {
        int sueldoSemanal, totalHoras, valorHora;
        
        sueldoSemanal = 0;
        totalHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total horas"));
        valorHora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor hora"));
        
        sueldoSemanal = totalHoras * valorHora;
        
        System.out.println("Total de horas semanla: " + totalHoras );
        System.out.println("Valor hora: " + valorHora);
        System.out.println("El sueldo semanal a cobrar es de: "+ sueldoSemanal);
        
    }
    
}
