package figuras;

public class Cuadrado extends Figura {
	private double lado;
	final private int numLado = 4;

	public Cuadrado(int lado) {
		super("cuadrado");
		setLado(lado);
	}
	@Override
	public double area() {
		
		return getLado()*getLado();
	}

	@Override
	public int numLados() {
		return numLado;
	}

	public double getLado() {
		return lado;
	}

	private void setLado(double lado) {
		this.lado = positivo(lado);
	}
	@Override
	public void dimeQuienSoy() {
		System.out.println("Soy un cuadrado");
	}

}
