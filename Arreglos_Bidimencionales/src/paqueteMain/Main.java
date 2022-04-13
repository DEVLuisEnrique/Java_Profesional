package paqueteMain;

public class Main {
	
	public static void main(String args[]) {
		System.out.println("Matrices");
		
		
		
		// matriz[fila][columna]
		
				int matriz[][] = new int[4][3];
				
				matriz[0][0] = 1;
				matriz[0][1] = 2;
				matriz[0][2] = 3;
				
				/*matriz[1][0] = 1;
				matriz[1][1] = 2;
				matriz[1][2] = 3;
				
				matriz[2][0] = 1;
				matriz[2][1] = 2;
				matriz[2][2] = 3;
				
				matriz[3][0] = 1;
				matriz[3][1] = 2;
				matriz[3][2] = 3;*/
				
				//rellenar matriz
				for(int fila = 0;fila < matriz.length;fila++) 
					{
						for(int colum = 0; colum< matriz[fila].length;colum++) 
							{
								matriz[fila][colum] = fila+1;
							}
					}
				
				for(int fila = 0;fila < matriz.length;fila++) 
					{
						for(int colum = 0; colum< matriz[fila].length;colum++) 
							{
								System.out.println("Matriz["+fila+"]["+colum+"] = "+matriz[fila][colum]);
							}
					}
		
		
		
	}
	
}
