package punto;

public class Punto {
	private int x, y;

	public Punto() {
		setX(0);
		setY(0);
	}

	public Punto(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	private void setX(int x) {
		if (x < 0)
			this.x = 0;
		else
			this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		if (y < 0)
			this.y = 0;
		else
			this.y = y;
	}
	
	public double modulo(){
		return Math.sqrt((getX() * getX()) + (getY() * getY()));
	}
	
	public double fase(){
		return Math.atan((double) getX()/getY());
	}

	@Override
	public String toString() {
		return "Coordenada x: "+getX()+"\nCoordenada y: "+getY();
	}
	
	

}
