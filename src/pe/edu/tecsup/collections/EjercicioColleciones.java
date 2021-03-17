package pe.edu.tecsup.collections;

import java.util.ArrayList;
import java.util.Collection;

public class EjercicioColleciones {

	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		// 1.- Definir los en una collecion los 3 primeros meses del año
//				
//		// 2.- Obtener el tamaño de la collecion
//		
//		// 3.- Agregar los 2 meses siguientes		
//		
//		// 4.- Recorrer todos los meses usando foreach		
//		
//		// 5.- Pregunta si esta registrado el mes "Noviembre"		
//		
//		// 6.- Preguntar si la lista de meses. no esta vacia		
//		
//	}

	
	 public static void main(String[] args) {
	        
	        // 1.- Definir los en una collecion los 3 primeros meses del año    
	        Collection<String> meses = new ArrayList<String>();	        
	        meses.add("Enero");  // String
	        meses.add("Febrero");  // String
	        meses.add("Marzo");  // String
	                
	        // 2.- Obtener el tamaño de la collecion
	        System.out.println("Longitud: " + meses.size());
	        
	        // 3.- Agregar los 2 meses siguientes        
	        meses.add("Abril");
	        meses.add("Mayo");

	        // 4.- Recorrer todos los meses usando foreach   	        
	        for(String mes : meses)
	            System.out.println("mes: " + mes);
	        
	        // 5.- Pregunta si esta registrado el mes "Noviembre"        
	        if (meses.contains("Noviembre"))
	            System.out.println("Noviembre esta registrado");	
	        else
	        	System.out.println("Noviembre No esta registrado");
	        
	        // 6.- Preguntar si la lista de meses. no esta vacia	        
	        if( meses.isEmpty())
	            System.out.println("Listado de meses vacios");	
	        else
	        	System.out.println("Listado con contenido de meses");
	        
	        
	 }
}
