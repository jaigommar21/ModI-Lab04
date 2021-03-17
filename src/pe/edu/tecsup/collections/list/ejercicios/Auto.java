package pe.edu.tecsup.collections.list.ejercicios;


public class Auto {

	private String modelo;
	private String nombreMarca;

	public Auto(String modelo, String nombreMarca) {
		super();
		this.modelo = modelo;
		this.nombreMarca = nombreMarca;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Auto) {
			Auto auto = (Auto) obj;
			if (auto.modelo != null && auto.modelo.equals(this.modelo) && auto.nombreMarca != null
					&& auto.nombreMarca.equals(this.nombreMarca)) {
				return true;
			}
		}
		return false;
	}

	
	public String getModelo() {
		return modelo;
	}

	public String getNombreMarca() {
		return nombreMarca;
	}
	
	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", nombreMarca=" + nombreMarca + "]";
	}
	
	
}
