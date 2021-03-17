package pe.edu.tecsup.collections.list.ejercicios;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Auto> autos = new ArrayList<Auto>();
		autos.add(new Auto("X001", "Toyota"));
		autos.add(new Auto("X002", "Nissan"));
		autos.add(new Auto("X003", "Pegaut"));

		Almacen almacen001 = new Almacen(autos);
		//almacen001.imprimir();
		
		System.out.println(almacen001.getMarcas());
		
		// Agregar un auto al almacen
		
		Auto autoNuevo = new Auto("X004", "BYD");
		
		almacen001.agregarAuto(autoNuevo);
		
		System.out.println(almacen001.getMarcas());

		
		
	}

}
