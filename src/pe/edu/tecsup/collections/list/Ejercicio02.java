package pe.edu.tecsup.collections.list;

import java.util.ArrayList;
import java.util.List;

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
class Auto {
	private String modelo;
	private String nombre;

	public Auto(String modelo, String nombre) {
		super();
		this.modelo = modelo;
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Auto) {
			Auto auto = (Auto) obj;
			if (auto.modelo != null && auto.modelo.equals(this.modelo) && auto.nombre != null
					&& auto.nombre.equals(this.nombre)) {
				return true;
			}
		}
		return false;
	}
}

public class Ejercicio02 {

	public static void main(String[] args) {

		List<Auto> autos = new ArrayList<Auto>();
		autos.add(new Auto("X001", "Toyota"));
		autos.add(new Auto("X002", "Nissan"));
		autos.add(new Auto("X003", "Pegaut"));

		Auto auto4 = new Auto("X002", "Nissan");

		if (autos.contains(auto4))
			System.out.println("Si se encuentra auto 04");
		else
			System.out.println("No se encuentra auto 04 ");

	}

}
