package pe.edu.tecsup.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestMain3 {

	public static void main(String[] args) {
		
		Persona persona2 = new Persona("45238754", "Miguel Chavez");
		List<Persona> personas = new ArrayList<Persona>();
		
		personas.add( new Persona("73456582", "Juan Velardes") );
		personas.add( new Persona("45238754", "Miguel Chavez") );
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}

		if(personas.contains( persona2 )) {
			System.out.println("Tenemos a Miguel");
		} else {
			System.out.println("Miguel no está");
		}
/*
		if(personas.contains( new Persona("76438643", "Jaime Farfan"))) {
			System.out.println("Tenemos a JF");
		} else {
			System.out.println("JF no está");
		}
*/		
	}

}

 /* Crear la clase Auto , que tenga los atributos
    modelo y nombre
    
    Crear una coleccion de Autos y almacenarlos en un List
    
     -  auto 1 => modelo = "X001" , nombre ="Toyota" 
     -  auto 2 => modelo = "X002" , nombre ="Nissan" 
     -  auto 3 => modelo = "X003" , nombre ="Pegaut" 
     
    Buscar si el siguiente auto4 esta en la lista
    
     -  auto 4 => modelo = "X002" , nombre ="Nissan"
     
    Comparar modelo y nombre 
     
  */




