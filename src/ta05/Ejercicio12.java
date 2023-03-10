package ta05;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String contraseña = "nomelase"; 
		
		boolean comprobacion = false; 
		
		for (int i = 0; i < 3 && !comprobacion; i++) { //cada vez que pasa por el for comprueba que el intento que es menor que 3 y que la contraseña sea true.  
			
			String contraseñaPeticion = JOptionPane.showInputDialog("Introduce la contraseña: "); 
			
			if (contraseñaPeticion.equals(contraseña) ) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				comprobacion = true; 
			}else {
				JOptionPane.showMessageDialog(null, "La contraseña no esta bien");

			}
			
		}
	}

}
