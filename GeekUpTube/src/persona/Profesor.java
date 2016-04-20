package persona;

import figuras.QuienSoy;

public class Profesor extends Persona implements QuienSoy {
	private int idProfesor;
	
	public Profesor (int edad, int idProfesor, String nombre, String apellido){
		super(edad, nombre, apellido);
		this.idProfesor = idProfesor;
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	@Override
	public void dimeQuienSoy() {
		System.out.println("Soy un profesor");
	}
	
}
