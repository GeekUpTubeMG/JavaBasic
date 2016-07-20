package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrimerosPasos {
	
	public static void main(String[] args) {
		String nombreFichero = "paquito.txt";
		String linea = "";
			try {
				FileWriter writer = new FileWriter(nombreFichero);
				for(int i = 0; i < 10;i++){
					writer.write("Hola amigo "+i+"\n");
				}
				writer.close();
				
				FileReader reader = new FileReader(nombreFichero);
				BufferedReader br = new BufferedReader(reader);
				
				while((linea = br.readLine()) != null){
					System.out.println(linea);
				}
				
				br.close();
				reader.close();
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
	}
}
