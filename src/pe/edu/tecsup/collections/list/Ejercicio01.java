package pe.edu.tecsup.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio01 {

	public static void main(String[] args) {
	
		// Realizar importaciones automaticas : Ctrl + Shift + O
		List <String> letras= new ArrayList<String>();
        letras.add("A");
        letras.add("A");
        letras.add("E");
        letras.add("I");
        letras.add("O");
        letras.add("U");
        
        System.out.println("Posición E: " + letras.indexOf("E"));
        letras.set(letras.indexOf("I"), "Y");
        letras.remove(letras.indexOf("U"));
        
        for (String string : letras) {
            System.out.println(string);
	}
	
  }
}