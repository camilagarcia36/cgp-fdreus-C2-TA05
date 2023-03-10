package ta05;

import java.util.Iterator;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int numero = 1; numero <= 100; numero++) {
			if (numero % 2 == 0 && numero % 3 == 0) { //si es 2 o 3, seria || en vez de &&
				System.out.println(numero);

			}
		}
		
	}

}
