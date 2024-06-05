package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import obtenerMedias.ObtenerMedias;

import alumnado.Alumnado;

public class FicheroWriter {

	private String donde;

	public String getDonde() {
		return donde;
	}

	public void setDonde(String donde) {
		this.donde = donde;
	}
	
	public <T> void write (List<Alumnado> alumnado) {
		
		ObtenerMedias om = new ObtenerMedias();
        double[] medias = om.mediasAsignatura(alumnado);
        
		
        String[] asignaturas = {"Lenguaje", "Matematicas", "Naturales", "Sociales", "Ingles"};
        
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(donde))) {
			
			
				
			for (int i = 0; i < 5; i++) {
                bw.write(asignaturas[i] + ":\n");
                for (Alumnado a : alumnado) {
                    bw.write(a.getNotas()[i] + " - ");
                }
                bw.write("\nMedia(" + medias[i] + ")\n");
                bw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}