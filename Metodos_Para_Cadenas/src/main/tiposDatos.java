package main;

public class tiposDatos {
	
	public static void main(String arg[]) {
		
	 

		String mensaje = "Hola mundo JAVA";
		
		/*char letra = mensaje.charAt(3); //selecciona un caracte
		System.out.println(letra);
		
		String mensaje2 = mensaje.concat(", JAVA");
		int lenght = mensaje2.length();
		
		System.out.println(mensaje2+"\n"+lenght);
		
		boolean letra2 = mensaje.contains("hola");
		
		System.out.println(letra2);*/
		
		boolean comienzaCon = mensaje.startsWith("Hola");
		boolean terminaCon = mensaje.endsWith("JAVA");
		System.out.println(comienzaCon);
		System.out.println(terminaCon);
	}

}
