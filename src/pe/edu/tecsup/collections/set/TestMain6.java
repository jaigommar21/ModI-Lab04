package pe.edu.tecsup.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestMain6 {

	public static void main(String[] args) {
		
		Set<Persona> personas = new HashSet<Persona>();
		
		personas.add( new Persona("73456582", "Juan Velardes") );
		personas.add( new Persona("45238754", "Miguel Chavez") );
		personas.add( new Persona("45238754", "Miguel Chavez") );
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}

		
		if( personas.contains( new Persona("45238754", "Miguel Chavez") ))
			System.out.println("Migual Chavez esta incluido");
		else
			System.out.println("Migual Chavez NO esta incluido");

		
		
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		personas.add( new Persona("76438643", "Jaime Farfan") );
		
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}

	}

	
	/* Crear la clase Smartphone , que tenga los atributos
	id, modelo y nombre

	Crear una coleccion de moviles y almacenarlos en un Set

	 -  movil 1 => id = 1 , modelo = "X001" , nombre ="Xiaomi" 
	 -  movil 2 => id = 2 , modelo = "X002" , nombre ="Samsung" 
	 -  movil 3 => id = 3 , modelo = "X003" , nombre ="iPHone" 
	 	 
    Tratar de ingresar nuevamente los siguientes moviles 
 
 	 -  movil 5 => id = 2 , modelo = "X002" , nombre ="Samsung" 
	 -  movil 6 => id = 3 , modelo = "X003" , nombre ="iPHone" 


	Buscar si el siguiente movil esta en el Set

	 -  movil 4 => id = 2, modelo = "X002" , nombre ="Samsung"
	
	*/
	
	
}
