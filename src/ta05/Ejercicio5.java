package ta05;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String numero = JOptionPane.showInputDialog("Ingresa el número: ");
				
				int numeroDivisible = Integer.parseInt(numero); 
				
				
				
				int resto = (numeroDivisible%2); 
				
				if (resto == 0) {
					//System.out.println("El numero " + numeroDivisible +" es divisible entre 2. ");
					JOptionPane.showMessageDialog(null, "El numero   "+ numeroDivisible + " es divisible entre 2. ");

					
				}else {
					//System.out.println("No es divisible entre 2. ");
					JOptionPane.showMessageDialog(null, "No es divisible entre 2.  ");

				}
				

	}

}
