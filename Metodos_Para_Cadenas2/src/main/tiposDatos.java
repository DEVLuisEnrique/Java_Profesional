package main;

public class tiposDatos {
	
	public static void main(String arg[]) {
			
		MensajeFeature msj = new MensajeFeature();
		

		String mensaje = "  Hola mundo JAVA  ";
		float version = 9.7f;
		
		
	
		//System.out.println(msj.mensajeUpperCase(mensaje));
		//System.out.println(msj.mensajeLowerCase(mensaje));
		
		String mensaje2 = String.format("Bienvenido al curso %s version %.1f %s","JAVA",version,"JDK");
		
		System.out.println(mensaje.toUpperCase().trim()); //mayuscula
		System.out.println(mensaje.toLowerCase().trim()); //minuscula
		
		System.out.println(mensaje.trim());
		
		System.out.println(mensaje2);
	
	}

}
