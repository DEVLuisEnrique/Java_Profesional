package packageMain;

public class Main {

	public static void main(String[] args) {
	
		String colorLuz = "azul ".toUpperCase().trim();
		
		
		
		if(colorLuz.equals("VERDE")) 
			{
				System.out.println(colorLuz);
				System.out.println("Puede continuar!");
			}
		else if(colorLuz.equals("AMARILLO"))
			{
				System.out.println(colorLuz);
				System.out.println("Alto parcial");
			}
		else if(colorLuz.equals("ROJO")) 
			{
				System.out.println(colorLuz);
				System.out.println("Alto total");
			}
		else 
			{
				System.out.println(colorLuz);
				System.out.println("Color no valido");
			}

		
		
	}

}
