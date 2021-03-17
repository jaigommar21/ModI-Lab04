package pe.edu.tecsup.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Introduccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> nombres = new ArrayList<String>();
		
		nombres.add("Jaime");  // String
		nombres.add("Maria");  // String
		nombres.add("Pedro");  // String
		nombres.add("Pedro");  // String
//		nombres.add(123456);   // entero nativo
//		nombres.add(false);   // entero nativo
//		nombres.add(0.314);   // entero nativo
		
		System.out.println(nombres);		
		
		nombres.remove("Maria");		
		System.out.println(nombres);
		
		nombres.add("Maribel");
		System.out.println(nombres);
		
		if (nombres.contains("Maria")) {
			System.out.println("Maria esta en la lista");
		} else {
			System.out.println("Maria NO esta en la lista");
		}

		if (nombres.contains("Maribel")) {
			System.out.println("Maribel esta en la lista");
		} else {
			System.out.println("Maribel NO esta en la lista");
		}
		
		for (String nom : nombres) {
			System.out.println(nom);
		}
		
		System.out.println("Hay " + nombres.size() + " nombres");
		
//		
//		int[] numeros = new int[10];
		
	}

}

/*

  Crear una collecion de dias de la semana, incluir "Feriado"
  
  Cuantos dias hay

  Luego eliminar feriado

  Verificar si el dia miercoles esta en listado

*/
