package packageMain;

public class Main {

	public static void main(String[] args) {
	
	
	 String colorLuz = "rojo";
	 
	switch (colorLuz.toUpperCase()) {
	case "AZUL": {
		System.out.println("Azul");	
	break;	
	}
	case "ROJO":{
		System.out.println("Rojo");	
	break;
	}
	case "AMARILLO":{
		System.out.println("Amarillo");	
	break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + colorLuz);
	}
	 	
	 
	 
	 	
	 
	 
		
		
	}

}
