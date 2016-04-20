package figuras;

public class Triangulo extends Figura {
	private double base,altura;
	final private int numLados = 3;

	public Triangulo(double base, double altura) {
		super("triangulo");
		setAltura(altura);
		setBase(base);
	}
	@Override
	public double area() {
		return (getAltura()*getBase())/2;
	}

	@Override
	public int numLados() {
		return this.numLados;
	}

	public double getBase() {
		return base;
	}

	private void setBase(double base) {
		this.base = positivo(base);
	}

	public double getAltura() {
		return altura;
	}

	private void setAltura(double altura) {
		this.altura = positivo(altura);
	}
	@Override
	public void dimeQuienSoy() {
		System.out.println("Soy un triangulo");
	}

}
