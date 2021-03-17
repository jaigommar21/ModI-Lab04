package pe.edu.tecsup.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio03 {

	/*
	Crear un arreglo de tipo List, que tenga lo siguiente

	 T , E, C , S , U , P 

	Encontrar la posicion de la S, 
	Reemplazar la letra S por N
	Reemplazar la letra U por O
	Remover la letra P
	Imprimir todo el listado

	*/

	/*
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> empresa= new ArrayList<String>();
		empresa.add("T");
		empresa.add("E");
		empresa.add("C");
		empresa.add("S");
		empresa.add("U");
		empresa.add("P");
		
		System.out.println(empresa);
		System.out.println(empresa.indexOf("S"));
		
		//empresa.set(3, "N");
		empresa.set(empresa.indexOf("S"), "N");        
		System.out.println(empresa);
		
		//empresa.set(4, "O");
        empresa.set(empresa.indexOf("U"), "O");
		System.out.println(empresa);
        
        empresa.remove(empresa.indexOf("P"));
		System.out.println(empresa);
        
        for(String letra: empresa) {
            System.out.println(letra);
        }
		
		
	}

	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> tecsup = new ArrayList<String>();
        tecsup.add("T");
        tecsup.add("E");
        tecsup.add("C");
        tecsup.add("S");
        tecsup.add("U");
        tecsup.add("P");
        
        System.out.println(tecsup);
        
        int index = tecsup.indexOf("S");
        System.out.println("La posicion de la S = " + index);
        
        tecsup.set(index, "N");
        
        int index1 = tecsup.indexOf("U");
        tecsup.set(index1, "O");
        
        tecsup.remove(5);
        
        for (String string : tecsup) {
            System.out.println("nombre = " + string);
        }
		
	}

	
}
