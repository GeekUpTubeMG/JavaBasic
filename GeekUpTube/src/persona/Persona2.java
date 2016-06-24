package persona;

import figuras.QuienSoy;

public class Persona2 implements Comparable<Persona2> {
	private String nombre,apellido;
	private int edad;
	
	public Persona2(int edad, String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApeelido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
	

	public void quienSoy(QuienSoy qs) {
	}

	@Override
	public String toString() {
		return "Nombre: "+getNombre()+", Apellido: "+getApeelido()+", Edad: "+getEdad();
	}

	@Override
	public int hashCode() {
		return edad*apellido.hashCode()*nombre.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona2 other = (Persona2) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Persona2 o) {
		int salida;
		
		if(o.getNombre().compareToIgnoreCase(this.nombre) == 0){
			if(o.getApeelido().compareToIgnoreCase(this.apellido) > 0){
				salida = -1;
			}else if(o.getApeelido().compareToIgnoreCase(this.apellido) < 0){
				salida = 1;
			}else{
				salida = 0;
			}
		}else if(o.getNombre().compareToIgnoreCase(this.nombre) > 0){
			salida = -1;
		}else{
			salida = 1;
		}
		
		return salida;
	}


	
	
}
