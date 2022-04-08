package packageMain;

public class Main {

	public static void main(String[] args) {
	
		
		int promedio = 10;
		
		if( promedio >= 7 ) 
			{
				//promedio aprobatorio
				if(promedio == 10) 
					{
						String mensaje = "Muchas Felicidades, su promedio es de "+promedio;
						//System.out.println("Muchas felicidades!");
						System.out.println(mensaje);
					
					}
				else 
					{
						System.out.println("Muchas Felicidades!");
					
					}
			
			}
		else {
			//promedio no es aprobatorio
			System.out.println("promedio no es aprobatorio!");
		}
		
		
		
		
	}

}
