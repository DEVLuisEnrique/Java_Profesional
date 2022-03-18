package main;

public class tiposDatos {
	
	public static void main(String arg[]) {
		
	 
		String name = "Luis Enrique";
		String lastName = "Rodriguez";
		int edad = 26;
		float altura = 5.4f;
		float peso = 130.245f;
		
		String salida = String.format("Nombre Completo: %s %s \nAltura: %.1f "
				+ "\nEdad: %d \nPeso: %.2f%s",name,lastName,altura,edad,peso,"Lbs");
		
		System.out.println(salida);
		
		
	}

}
