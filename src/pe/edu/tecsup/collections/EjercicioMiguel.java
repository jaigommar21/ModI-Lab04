package pe.edu.tecsup.collections;

import java.util.ArrayList;
import java.util.Collection;

public class EjercicioMiguel {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Collection<String> dias = new ArrayList<String>();
	        
	        dias.add("Lunes");
	        dias.add("Martes");
	        dias.add("Miercoles");
	        dias.add("Jueves");
	        dias.add("Viernes");
	        dias.add("Sabado");
	        dias.add("Domingo");
	        dias.add("Feriado");
	        System.out.println(dias);
	        
	        System.out.println("Hay " + dias.size() + " dias");
	        
	        dias.remove("Feriado");
	        
	        if(dias.contains("Miercoles")) {
	            System.out.println("Hay el dia miercoles");
	        } else {
	            System.out.println("No hay dia Miercoles");
	        }
	    }
}
