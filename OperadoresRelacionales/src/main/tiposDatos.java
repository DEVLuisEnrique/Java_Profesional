package main;

public class tiposDatos {
	
	public static void main(String arg[]) {
		
	
		
		
		
		boolean resultado;
		
		//AND
		resultado = (5 >= 5) && (true) && (10 > 9);
		System.out.println(resultado);
		
		//OR
		
		resultado = false || false || false || true;
		System.out.println(resultado);
		
		//combinacion
		resultado = (5 >= (2 * 3) || true) && ((true) && (10 > 5));
		System.out.println(resultado);
		
		//NOT
		resultado = !((5 >= (2 * 3) || true) && ((true) && (10 > 5)));
		System.out.println(resultado);
		
	}

}
