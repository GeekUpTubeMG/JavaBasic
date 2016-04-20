package clasesIniciales;

public class PromocionCasting {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i = 3;
		byte b = (byte)i ;
		byte b2 = 2;
		b2 =  (byte) (b*3);
		
		int numerador = 10;
		int denominador = 4;
		
		double uno = 2;
		double dos = 2;
		int resultado2= (int) (uno/dos);
		double reulstado = numerador/2;
		
		double extra = 2;
		double resul = (numerador/denominador)+extra;//  int/int + double (error de precision)

		/* 		SOLUCION
		 
			(double)int/int + double 
					Ó  
			1.0*int/int + double
		*/
		double resul2 = ((double)numerador/denominador)+extra;
		double resul3 = (1.0*numerador/denominador)+extra;
		System.out.println(resul);
		System.out.println(resul2);
		System.out.println(resul3);


	}

}
