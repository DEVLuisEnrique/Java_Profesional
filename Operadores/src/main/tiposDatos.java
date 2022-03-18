package main;

public class tiposDatos {
	
	public static void main(String arg[]) {
		
	 int x1 = 50, x2 = 10;
	 int result;
	 
	 
	 //suma
	 result = x1 + x2;
	 System.out.println("Suma: "+x1+"+"+x2+" = "+ result);
	 
	 //resta
	 result = x1 - x2;
	 System.out.println("Resta: "+x1+"-"+x2+" = "+ result);
	 
	 //multiplicacion
	 result = x1 * x2;
	 System.out.println("Multiplicacion: "+x1+"*"+x2+" = "+ result);
	 
	 
	 x1++; //incremeto en uno
	 x1--; //descrece en uno
	 x2 += 100; //incremento en 100
	 System.out.println(x2);
		
		
	}

}
