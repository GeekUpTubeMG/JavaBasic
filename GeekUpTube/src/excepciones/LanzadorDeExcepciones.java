package excepciones;

public class LanzadorDeExcepciones {

	public static void lanzarExcepcion() throws MiExcepcion{
		throw new MiExcepcion("Esta es mi excepcion");
	}
	
}
