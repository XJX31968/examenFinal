package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import alumnado.Alumnado;



public class FicheroReader {

	
	public static List<Alumnado> getDatos(String nombreFichero) {
		
		List<Alumnado> alumnos = new ArrayList<Alumnado>();
		
		try {
			
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(nombreFichero));
			
			while(ficheroEntrada.ready()) {
				
				
				String nombre = ficheroEntrada.readLine();
				 int[] notas = new int[5];
		            for (int i = 0; i < 5; i++) {
		                String nota = ficheroEntrada.readLine();
		                if (nota != null) {
		                    notas[i] = Integer.parseInt(nota);
		                }
		            }
		            
		            
		            Alumnado alumno = new Alumnado(nombre);
		            alumno.setNotas(notas);
		            alumnos.add(alumno);
				
					
			}
			
			 ficheroEntrada.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return alumnos;
	}
	
}
			
			
			
			
			
			
	