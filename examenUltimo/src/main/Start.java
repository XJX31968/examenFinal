package main;

import files.FicheroReader;
import files.FicheroWriter;
import obtenerMedias.ObtenerMedias;

import java.util.List;

import alumnado.Alumnado;

public class Start {

	public static void main(String[] args) {
		
		List<Alumnado> alumnos = FicheroReader.getDatos("calificaciones.txt");
		System.out.println(alumnos);
		
		FicheroWriter fw = new FicheroWriter();
        fw.setDonde("prueba.txt"); // Set the output file path
        fw.write(alumnos);
        
        ObtenerMedias om = new ObtenerMedias();
        double media = om.mediaAlumno(alumnos.get(0));
        System.out.println(media);
    }
}	
		

