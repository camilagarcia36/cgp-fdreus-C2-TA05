package ta05;

import javax.swing.JOptionPane;

public class CalculadoraInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = JOptionPane.showInputDialog("Escribe el primer numero: ");
		Double n1 = Double.parseDouble(a); 
		
		String nAritmetico = JOptionPane.showInputDialog("Escribe el simbolo: ");

		String b = JOptionPane.showInputDialog("Escribe el segundo numero: ");
		Double n2 = Double.parseDouble(b); 
		

		Double resultado = 0.0 ; 
		
		switch (nAritmetico) {
		case "+":
			resultado = n1+ n2; 
			break;
			
		case "-":
			resultado = n1-n2; 
			break;
		case "*":
			resultado = n1*n2; 
			break;
		case "/":
			resultado = n1/n2; 
			break;
		case "%":
			resultado = n1% n2; 
			break;
		case "^":
			resultado = Math.pow(n1, n2); 
			break;
		default:
			JOptionPane.showMessageDialog(null, "Signo aritmético no válido.");		
			return; 
		}
		
		JOptionPane.showMessageDialog(null, resultado);
		
	}

}
