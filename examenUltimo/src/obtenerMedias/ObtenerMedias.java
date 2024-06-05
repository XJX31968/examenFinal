package obtenerMedias;

import java.util.List;

import alumnado.Alumnado;


public class ObtenerMedias {

	 public double[] mediasAsignatura(List<Alumnado> alumnado) {
	        int numeroAlumnos = alumnado.size();
	        int numeroAsignaturas = 5; 

	        double[] sumas = new double[numeroAsignaturas]; 

	        for (Alumnado a : alumnado) {
	            for (int i = 0; i < numeroAsignaturas; i++) {
	                sumas[i] += a.getNotas()[i]; 
	            }
	        }

	        double[] medias = new double[numeroAsignaturas]; 

	        for (int i = 0; i < numeroAsignaturas; i++) {
	            medias[i] = sumas[i] / numeroAlumnos; 
	        }

	        return medias;
	    }
	 
	 
	 
	 
	 
	 public double mediaAlumno(Alumnado alumno) {
	        double sum = 0;
	        int[] notas = alumno.getNotas();
	        for (int j = 0; j < 5; j++) {
	            sum += notas[j];
	        }
	        double operacion = sum / 5;
	        return operacion;
	    }
}
	 
	 
	 
	 
	 
	
	
	
	

