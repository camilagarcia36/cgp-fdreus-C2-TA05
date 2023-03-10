package ta05;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//multiplicar el precio por el iva y despues sumar el resultado 
		
		String precioInicial = JOptionPane.showInputDialog("Ingresa el precio del producto: ");
		double precio = Double.parseDouble(precioInicial); 
		

		double IVA =0.21; 
		
		double precioFinal = precio + (IVA*precio); 
		
		
		JOptionPane.showMessageDialog(null, "El precio final con IVA es "+  precioFinal);
		

	}

}
