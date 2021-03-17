package pe.edu.tecsup.collections.set;

import pe.edu.tecsup.collections.list.sort.Student;

public class Persona {

	private String dni;
	
	private String nombres;

	public Persona() {
		super();
	}

	public Persona(String dni, String nombres) {
		super();
		this.dni = dni;
		this.nombres = nombres;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombres=" + nombres + "]";
	}

	@Override
	public boolean equals(Object object) {
		//System.out.println("comparacion");
		if(object instanceof Persona) {
			Persona persona = (Persona) object;
			if(persona.dni != null && persona.dni.equals(this.dni)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Es usado como identificado unico en Set
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(this.dni); // Convierte una cadena a entero
	}
	
	
}
