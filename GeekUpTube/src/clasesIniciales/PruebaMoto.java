package clasesIniciales;
import java.util.Scanner;

public class PruebaMoto {

	public static void main(String[] args) {
		/*
		Moto miMoto = new Moto(4456,"honda");
		Moto miMoto2 = new Moto(500, 2015, 4458, "Suzuki", "verde");
		Moto miMoto3 = new Moto(500, 1998, 4496, "Suzuki", "verde");
		
		System.out.println("El estado de mi moto 1 es: "+miMoto.getEstado()+miMoto.getMatricula());
		System.out.println("El estado de mi moto 2 es: "+miMoto2.getEstado()+miMoto2.getMatricula());
		System.out.println("El estado de mi moto 3 es: "+miMoto3.getEstado()+miMoto3.getMatricula());
		*/
		
		int matricula;
		String marca;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introducir marca de la moto");
		marca = leer.nextLine();
		System.out.println("Introducir matricula de la moto");
		matricula = leer.nextInt();
		leer.close();
		
		Moto miMoto = new Moto(matricula,marca);
		
		System.out.println("Matricula => " + miMoto.getMatricula() + "\nMarca => " + miMoto.getMarca());
		
		

	}

}
