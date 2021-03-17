package pe.edu.tecsup.collections.list.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

	// Para importa automaticamente usar
	// las teclas  Ctrl+Space
	private List<Auto>  autos;
	
	public Almacen(List datos) {
		this.autos = datos;
	}
	
	public void imprimir(){
		System.out.println(this.autos);
	}
	
	/**
	 *  Metodo que retorna las marcas de los autos 
	 *  del almacen
	 * @return Listado de marcas
	 */
	public List getMarcas(){		
		List<String> marcas = new ArrayList<String>();
        for (Auto auto : this.autos) 
        	marcas.add(auto.getNombreMarca());        
        return marcas;
		
	}

	public void agregarAuto(Auto autoNuevo) {
		// TODO Auto-generated method stub
		this.autos.add(autoNuevo);
	}
	
}
