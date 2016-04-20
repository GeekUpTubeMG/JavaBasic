package persona;

import figuras.QuienSoy;

public class Alumno extends Persona implements QuienSoy {
	private String dniAlumno;
	private int telfContacto;
	
	public Alumno(int edad, String nombre, String apellido, String dni, int telfContacto){
		super(edad, nombre, apellido);
		this.dniAlumno = dni;
		this.telfContacto = telfContacto;
	}

	public String getDniAlumno() {
		return dniAlumno;
	}

	public int getTelfContacto() {
		return telfContacto;
	}

	@Override
	public void dimeQuienSoy() {
		System.out.println("soy un alumno");
	}
	
	
}
