package main;

import java.util.Iterator;

public class tiposDatos {
	
	public static void main(String arg[]) {
		
	
	int calificaciones[] = {9,5,2,6,9,10,4,8,4,3,7,9,10,5,3,3};
	int tArreglo = calificaciones.length;
	int sumatoria = 0;
	float promedio;
	//promedio
	for (int calificacion : calificaciones) {
		sumatoria = sumatoria + calificacion;
	}
		
	
	
	promedio = sumatoria / tArreglo;
	System.out.println("Tamaño del arreglo: "+tArreglo);
	System.out.println("Sumatoria: "+sumatoria);
	System.out.println("Promedio: "+promedio);
	 
		
	
	}

}
