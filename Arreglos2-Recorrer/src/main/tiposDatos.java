package main;

import java.util.Iterator;

public class tiposDatos {
	
	public static void main(String arg[]) {
		
		
		
	//String nombres[] = {"Codi 1","Codi 2","Codi 3"};
	String []nombres = new String[3];
	
	nombres[0] = "Luis Rodriguez";
	nombres[1] = "Codigo Facilito";
	nombres[2] = "Arreglo Java";
	
	//System.out.println(nombres[0]);
	//System.out.println(nombres[1]);
	//System.out.println(nombres[2]);
	
	System.out.println("==Foreach==");
	for (String datosNombres : nombres) { //foreach
		System.out.println(datosNombres);
	}
	
	
	System.out.println("\n==For==");
	for(int c = 0; c < nombres.length; c++) //for
		{
			System.out.println(nombres[c]);
		}
		
	}

}
