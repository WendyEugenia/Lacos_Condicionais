package Atividades;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner leia = new Scanner(System.in);
			
			int numero1, numero2, numero3, total;
			
			System.out.println("\nDigite o número A:");
			numero1 = leia.nextInt();
			
			System.out.println("\nDigite o número B:");
			numero2 = leia.nextInt();
			
			System.out.println("\nDigite o número C:");
			numero3 = leia.nextInt();
			
			total = numero1 + numero2;
			
			if(total > numero3) {
				System.out.println("\n"+numero1+" + "+numero2+" = "+total+" >"+numero3+"\nA soma de A + B é maior do que C");
			} else if(total<numero3) {
				System.out.println("\n"+numero1+" + "+numero2+" = "+total+" < "+numero3+"\nA soma de A + B é menor do que C");
			} else {
				System.out.println("\n"+numero1+" + "+numero2+" = "+total+" = "+numero3+"\nA soma de A + B é igual a C");
			}
	}

}
