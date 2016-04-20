package figuras;

public class ManejadorFiguras {

	
	public Figura areaMayor (Figura[] misFiguras){
		Figura figuraMayor = null;
		int cont = 0;
		for(int i = 1;i < misFiguras.length; i++){
			if(misFiguras[i].area() >= misFiguras[cont].area()){
				figuraMayor = misFiguras[i];
			}else{
				figuraMayor = misFiguras[cont];
			}
			cont++;
		}
		
		return figuraMayor;
	}
	
	public double sumaAreas(Figura[] misFiguras){
		double areas = 0;
		for(Figura fig: misFiguras){
			areas = areas + fig.area();
		}
		return areas;
	}

}
