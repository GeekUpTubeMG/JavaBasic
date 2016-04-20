package figuras;

public abstract class Figura implements QuienSoy {
	
	private String descripcion;
	
	public Figura (String desc){
		this.descripcion = desc;
	}
	
	 abstract public double area();
	 abstract public int numLados();
	 
	 public String getDescripcion (){
		 return this.descripcion;
	 }

	protected double positivo(double num){
			if (num<0){
				num = num*(-1);
			}else if(num == 0){
				num = 1;
			}
			return num;
	}
}
