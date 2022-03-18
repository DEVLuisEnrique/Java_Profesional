package main;

public class tiposDatos {
	
	public static void main(String arg[]) {
		
	 
	String cadena1 = "HolA";
	String cadena2 = "hola";
	
	boolean resultado = cadena1.toUpperCase().equals(cadena2.toUpperCase());
		
	System.out.println(resultado);
	
	
	resultado = cadena1.equalsIgnoreCase(cadena2);
	System.out.println(resultado);
	/*
	String nuevaCadena1 = cadena1.toUpperCase();
	String nuevaCadena2 = cadena2.toUpperCase();
	
	resultado = nuevaCadena1.equals(nuevaCadena2);
	
	System.out.println(resultado);
		*/
	}

}
