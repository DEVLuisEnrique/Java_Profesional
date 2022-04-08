package main;

import java.util.Iterator;

public class tiposDatos {
	
	public static void main(String arg[]) {
		
	String nombreCompleto = "Luis Enrique Rodriguez Gonzalez";
	
	int tArreglo = nombreCompleto.length();
	int indiceR = nombreCompleto.indexOf("R");
	
	char letraL = nombreCompleto.charAt(0);
	char letraR = nombreCompleto.charAt(13);
	
	System.out.println(tArreglo);
	System.out.println(letraL+"."+letraR);
	System.out.println(indiceR);
	
	
		
	
	}

}
