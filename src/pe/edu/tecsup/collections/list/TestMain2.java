package pe.edu.tecsup.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestMain2 {

	public static void main(String[] args) {
		
		List<String> nombres = new ArrayList<String>();
		
		nombres.add("Juan");    // 0
		nombres.add("Miguel");	// 1
		nombres.add("Julio");   // 2
		nombres.add("María");   // 3
		nombres.add("María");   // 4
		
		String nombre = nombres.get(1);
		System.out.println(nombre);
		
		nombres.set(1, "Pablo");
		
		nombre = nombres.get(1);
		System.out.println(nombre);
		
		int index = nombres.indexOf("María");
		System.out.println(index);
		
		nombres.set(index, "Helena");
		
		nombres.add("Juan");
		
		for (String n : nombres) {
			System.out.println("nombre =  " + n);
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


/*

Crear un arreglo de tipo List, que tenga lo siguiente

 T , E, C , S , U , P 

Encontrar la posicion de la S, 
Reemplazar la letra S por N
Reemplazar la letra U por O
Remover la letra P
Imprimir todo el listado

*/




