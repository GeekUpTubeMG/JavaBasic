package punto;

public class PruebaPunto {

	public static void main(String[] args) {
		Punto uno = new Punto(3,5);
		PuntoTiempo dos = new PuntoTiempo(2, 2, 0);
		
		System.out.println(dos.toString());
		System.out.println("la velociad de nuestro punto es: "+dos.velocidad());
		System.out.println(uno.toString());
	}

}
