package punto;

public class PuntoTiempo extends Punto {
	private int tiempo;
	
	public PuntoTiempo(int x, int y, int t){
		super(x, y);
		setTiempo(t);
	}

	public int getTiempo() {
		return tiempo;
	}

	private void setTiempo(int tiempo) {
		if (tiempo <= 0)
			this.tiempo = 1;
		else
			this.tiempo = tiempo;
	}
	
	public double velocidad(){
		return this.modulo()/getTiempo();
	}

	@Override
	public String toString() {
		return super.toString()+"\nCoordenada tiempo: "+getTiempo()+"\n";
	}
	
	
}
