package pe.edu.tecsup.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestMain2 {

	public static void main(String[] args) {
		
		List<String> nombres = new ArrayList<String>();
		nombres.add("Juan");
		nombres.add("Miguel");	// 1
		nombres.add("Julio");
		nombres.add("María");
		nombres.add("María");
		
		String nombre = nombres.get(1);
		System.out.println(nombre);
		
		nombres.set(1, "Pablo");
		
		nombre = nombres.get(1);
		System.out.println(nombre);
		
		int index = nombres.indexOf("María");
		System.out.println(index);
		
		nombres.set(index, "Helena");
		
		nombres.add("Juan");
		
		for (String string : nombres) {
			System.out.println(string);
		}

	}

}

/*
 
  Crear un arreglo de tipo List, que tenga lo siguiente
  
   A , A, E , I , O , U 
  
  Encontrar la posicion de la E, 
  Reemplazar la letra I por Y
  Remover la letra U
  Imprimir todo el listado

 */


