package pe.edu.tecsup.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestMain4 {

	public static void main(String[] args) {
		
		Persona persona2 = new Persona("45238754", "Miguel Chavez");
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add( new Persona("73456582", "Juan Velardes") );
		personas.add( persona2 );
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}

		if(personas.contains( new Persona("76438643", "Jaime Farfan") )) {
			System.out.println("Tenemos a Jaime");
		} else {
			System.out.println("Jaime no está");
		}
		
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		
	}

}
