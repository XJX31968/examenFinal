package alumnado;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Alumnado {

	private String nombre;
	private int[] notas;
	private Map<String,Integer> asignaturas;

	
	
	
	
	public Alumnado(String nombre) {
		super();
		this.nombre = nombre;
		this.notas = new int[5];
		this.asignaturas = new HashMap<String, Integer>();;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	public Map<String, Integer> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(Map<String, Integer> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
	public void fusionarNotaConCodigo (int[] notas) {
		
		for(int i=0;i<5;i++) {
			
			switch (i) {
			
			case 0: asignaturas.put("Lengua", notas[i]); break;
			case 1: asignaturas.put("Matematicas", notas[i]); break;
			case 2: asignaturas.put("Naturales", notas[i]); break;
			case 3: asignaturas.put("Sociales", notas[i]); break;
			case 4: asignaturas.put("Ingles", notas[i]); break;
			
			}
			
			
		}
		
	}
	@Override
	public String toString() {
		return "Alumnado [nombre=" + nombre + ", notas=" + Arrays.toString(notas) + ", asignaturas=" + asignaturas
				+ "]";
	}
	
	
	
	
	
	
}
