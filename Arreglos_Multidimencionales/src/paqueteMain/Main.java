package paqueteMain;

public class Main {
	
	public static void main(String args[]) {
			
		//Arreglos Dinamicos
		
		int calificaciones[][] = new int[5][];
		
		calificaciones[0] = new int[1]; //E
		calificaciones[1] = new int[2]; //A
		calificaciones[2] = new int[3]; //D
		calificaciones[3] = new int[4]; //B
		calificaciones[4] = new int[5]; //C
		
		
		calificaciones[0][0] = 8;
		
		calificaciones[1][0] = 9;
		calificaciones[1][1] = 10;
		
		calificaciones[2][0] = 11;
		calificaciones[2][1] = 12;
		calificaciones[2][2] = 13;
		
		calificaciones[3][0] = 14;
		calificaciones[3][1] = 15;
		calificaciones[3][2] = 16;
		calificaciones[3][3] = 17;
		
		calificaciones[4][0] = 18;
		calificaciones[4][1] = 19;
		calificaciones[4][2] = 20;
		calificaciones[4][3] = 21;
		calificaciones[4][4] = 22;
		
		for (int[] calificacionPorPesona : calificaciones) {
			for (int calificacion : calificacionPorPesona) {
				System.out.print(calificacion+" ");
			}
			System.out.println();
		}
	}
	
}
