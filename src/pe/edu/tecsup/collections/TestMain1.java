package pe.edu.tecsup.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestMain1 {

	public static void main(String[] args) {
		
//		String[] nombres = new String[10];
		//nombres[2]

		// Collection
		Collection<String> nombres = new ArrayList<String>();
		nombres.add("Juan");
		nombres.add("Miguel");
		nombres.add("Julio");
		nombres.add("María");
		
		System.out.println("Longitud: " + nombres.size());
		
		nombres.remove("Juan");
		
		System.out.println("Longitud: " + nombres.size());
		
		if(nombres.contains("Julio")) {
			System.out.println("Julio está en la lista!");
		} else {
			System.out.println("Julio no fue invitado :(");
		}
		
//		nombres.clear();
		
		if(nombres.isEmpty()) {
			System.out.println("No hay nadie en lista!");
		} else {
			System.out.println("Tenemos invitados :)");
		}
		
		// Iterar (foreach)
		for(String nombre : nombres) {
			System.out.println("Invitado: " + nombre);
		}
		
	}

}
