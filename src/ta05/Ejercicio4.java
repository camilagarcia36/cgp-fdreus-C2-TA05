package ta05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Scanner numero = new Scanner (System.in); 
		
		System.out.println("Introduce el radio de la circumferencia: ");
		
		double radio = numero.nextDouble();  
		numero.close();
		
	
		double area = Math.PI*radio*radio;
		
		System.out.println("El area del circulo es " + area);
		*/
		
		
		String radioString = JOptionPane.showInputDialog("Ingresa el radio: ");
		
		Double radio = Double.parseDouble(radioString); 
		
		double areaCirculo= Math.PI*Math.pow(radio, 2);
		
		JOptionPane.showMessageDialog(null, "El area es = " + areaCirculo);

		

				
	}

}
