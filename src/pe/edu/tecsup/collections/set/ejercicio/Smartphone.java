package pe.edu.tecsup.collections.set.ejercicio;

public class Smartphone {

	int id;
	String modelo;
	String nombre;

	public Smartphone() {
		// TODO Auto-generated constructor stub
	}

	public Smartphone(int id, String modelo, String nombre) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Smartphone) {
			Smartphone smart = (Smartphone) obj;
			if (smart.modelo != null && smart.modelo.equals(this.modelo) && smart.nombre != null
					&& smart.nombre.equals(this.nombre)) {
				return true;
			}
		}
		return false;
	}

	
	
}
