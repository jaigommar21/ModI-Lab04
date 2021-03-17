package pe.edu.tecsup.collections.list.ejercicios;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nombres = new ArrayList<String>();
		nombres.add("Juan");
		nombres.add("Maria");
		nombres.add("Pedro");
		System.out.println(nombres);
		
		List<Auto> autos = new ArrayList<Auto>();
		autos.add(new Auto("X001", "Toyota"));
		autos.add(new Auto("X002", "Nissan"));
		autos.add(new Auto("X003", "Pegaut"));

		System.out.println(autos);
		/*
		for (Auto auto : autos) {
			System.out.println(auto.getNombreMarca());
		}*/
		
		
	}

}
