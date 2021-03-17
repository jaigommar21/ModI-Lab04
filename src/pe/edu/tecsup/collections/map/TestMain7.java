package pe.edu.tecsup.collections.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMain7 {

	public static void main(String[] args) {
		
		Map<Integer, Persona> personas = new HashMap<Integer, Persona>();
		
		Persona p1 = new Persona("73456582", "Juan Velardes");
		Persona p2 = new Persona("45238754", "Miguel Chavez");
		Persona p3 = new Persona("76438643", "Jaime Farfan");
		
		personas.put(1001,p1);
		personas.put(1002,p2);
		personas.put(1003,p3);
		personas.put(1004,p3);
		
		System.out.println(personas.get(1003));		

		System.out.println(personas.keySet());
		
		System.out.println(personas.values());
		
		Collection<Persona> c = personas.values();		
		for (Persona p : c) {
			System.out.println(p);
		}
		
	}

}
