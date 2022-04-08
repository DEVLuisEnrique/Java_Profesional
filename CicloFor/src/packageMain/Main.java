package packageMain;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

	 	
	//NUMEROS PARES DEL 1 AL 100
	 //For
		int ingreseNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "));
		
			if(ingreseNumero > 0) 
				{
					for(int cont = 1;cont <= ingreseNumero ;cont++) 
						{
							if(cont % 2 == 0) 
								{
								
									System.out.print(cont+", ");
								}
							
						
							
						}
				}else {
					System.out.print("Ingrese un valor positivo");
				}
		
		
	
	}

}
