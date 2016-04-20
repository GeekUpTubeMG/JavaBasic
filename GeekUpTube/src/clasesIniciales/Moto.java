package clasesIniciales;

public class Moto {
	
	private int cc, añoDeMatriculacion, matricula;
	private String marca, color, estado;
	
	public Moto(int matricula, String marcaC){
		
		setMatricula(matricula);
		setMarca(marcaC);
		
		setCc(0);
		setAñoDeMatriculacion(0);
		setColor("desconocido");
		setEstado();
	}

	public Moto(int centrimetrosCubicos,int añoMatricula, int matricula, String marca, String color){
		
		setCc(centrimetrosCubicos);
		setAñoDeMatriculacion(añoMatricula);
		setMatricula(matricula);
		setMarca(marca);
		setColor(color);
		setEstado();
	}
	
	public String getEstado() {
		return estado;
	}

	public int getCc() {
		return cc;
	}

	public int getAñoDeMatriculacion() {
		return añoDeMatriculacion;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}
	
	private void setEstado() {
		
		if (getAñoDeMatriculacion() != 0){
			if (getAñoDeMatriculacion() <= 2000){
				estado = "malo";
			}else{
				estado = "bueno";
			}
		}else{
			estado = "desconocido";
		}
		
	}

	private void setCc(int cc) {
		this.cc = cc;
	}

	private void setAñoDeMatriculacion(int añoDeMatriculacionS) {
		this.añoDeMatriculacion = añoDeMatriculacionS;
	}

	private void setMatricula(int matriculaS) {
		this.matricula = matriculaS;
	}

	private void setMarca(String marcaS) {
		this.marca = marcaS;
	}

	private void setColor(String colorS) {
		this.color = colorS;
	}

}
