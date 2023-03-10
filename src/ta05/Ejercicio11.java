package ta05;


import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        
        String diaString = new String (JOptionPane.showInputDialog("Introduce el dia de la semana: ")); 
        
        
        String tipoDia = null;
        
        switch (diaString.toLowerCase()) {
        case "lunes": 
        case "martes": 
        case "miercoles": 
        case "jueves": 
        case "viernes": 
        	tipoDia = "Es un dia laboral";
        	break; 
        	
        case "sabado":
        case "domingo": 
        	tipoDia = "No es un dia laboral";
        	break; 
        	default: 
        		tipoDia = "Introduce un dia válido. "; 
        		
        }
        
        JOptionPane.showMessageDialog(null, tipoDia);
	}
	}


