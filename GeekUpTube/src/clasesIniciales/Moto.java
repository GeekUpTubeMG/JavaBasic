package clasesIniciales;

public class Moto {
	
	private int cc, a�oDeMatriculacion, matricula;
	private String marca, color, estado;
	
	public Moto(int matricula, String marcaC){
		
		setMatricula(matricula);
		setMarca(marcaC);
		
		setCc(0);
		setA�oDeMatriculacion(0);
		setColor("desconocido");
		setEstado();
	}

	public Moto(int centrimetrosCubicos,int a�oMatricula, int matricula, String marca, String color){
		
		setCc(centrimetrosCubicos);
		setA�oDeMatriculacion(a�oMatricula);
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

	public int getA�oDeMatriculacion() {
		return a�oDeMatriculacion;
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
		
		if (getA�oDeMatriculacion() != 0){
			if (getA�oDeMatriculacion() <= 2000){
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

	private void setA�oDeMatriculacion(int a�oDeMatriculacionS) {
		this.a�oDeMatriculacion = a�oDeMatriculacionS;
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
