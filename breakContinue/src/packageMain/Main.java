package packageMain;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

	 	
	int valor = 10;
	
	switch(valor) 
		{
			case 10:
				{
					System.out.println("Es 10");
					break;
				}
			default:
				{
					System.out.println("No es 10");	
				}
		}
		
		for(int i=1;i<=10;i++) 
			{
				if(i == 5) 
					{
					 	continue;
					}
				System.out.print(i+",");
			}
		System.out.println("");
		System.out.println("Ciclo completado");
	}

}
