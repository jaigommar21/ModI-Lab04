package pe.edu.tecsup.collections;

import java.util.ArrayList;
import java.util.Collection;

public class EjercicioJonas {

	public static void main(String[] args) {
		Collection<String> dias = new ArrayList<String>();

		dias.add("lunes"); // String
		dias.add("martes"); // String
		dias.add("miercoles"); // String
		dias.add("jueves"); // String
		dias.add("viernes"); // String
		dias.add("sabado");// String
		dias.add("domingo"); // String
		dias.add("feriado"); // String

		System.out.println(dias);
		System.out.println(dias.size());

		dias.remove("feriado");
		System.out.println(dias);

		if (dias.contains("miercoles")) {
			System.out.println("miercoles esta en la lista");
		} else {
			System.out.println("miercoles NO esta en la lista");
		}

		
		Collection<String> diasLaborables = new ArrayList<String>();

		diasLaborables.add("lunes"); // String
		diasLaborables.add("martes"); // String
		diasLaborables.add("miercoles"); // String
		diasLaborables.add("jueves"); // String
		diasLaborables.add("viernes"); // String
		
		if( dias.containsAll(diasLaborables))
			System.out.println("Tiene los dias Laborables");
		else
			System.out.println("No contiene todos los dias Laborables");
		
	}

}
