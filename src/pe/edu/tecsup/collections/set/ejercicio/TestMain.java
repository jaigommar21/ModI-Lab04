package pe.edu.tecsup.collections.set.ejercicio;

import java.util.HashSet;
import java.util.Set;

import pe.edu.tecsup.collections.set.Persona;

public class TestMain {

	
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartphone s1 = new Smartphone(1,"X001" ,"Xiaomi" );
		Smartphone s2 = new Smartphone(2,"X002" ,"Samsung" );
		Smartphone s3 = new Smartphone(3,"X003" ,"iPhone" );
		
		Set<Smartphone> moviles = new HashSet<Smartphone>();
		
		moviles.add(s1);
		moviles.add(s2);
		moviles.add(s3);
		moviles.add(s2);
		moviles.add(s3);
		
		for (Smartphone smartphone : moviles) {
			System.out.println(smartphone);
		}

		if ( moviles.contains(s2))
			System.out.println("El modelo X002 esta contenido");
		
	}

}
