package ta05;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ventasString = JOptionPane.showInputDialog("Introduce numero de ventas: "); 
		double ventas = Double.parseDouble(ventasString);
		
		double sumaVentas = 0; 
		
		for (int i = 0; i < ventas; i++) {
			String ventaString = JOptionPane.showInputDialog("Introduce venta " + (i+1) + " : "); 
			double venta = Double.parseDouble(ventaString);

			sumaVentas += venta; 
			
		}
		
		//Suma de ventas
		
		JOptionPane.showMessageDialog(null,"La suma de ventas es " + sumaVentas);

	}

}
