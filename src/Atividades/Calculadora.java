package Atividades;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float numero1, numero2, total;
		int op;
		
		System.out.println("\nDigite o 1º número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("\nDigite o 2º número:");
		numero2 = leia.nextFloat();
		
		System.out.println("\nOperação: ");
		op = leia.nextInt();
		
		switch(op) { 
		
		case 1:
			total = numero1 + numero2;
			System.out.println("\n"+numero1+" + "+numero2+" = "+total);
			break;
			
		case 2:
			total = numero1 - numero2;
			System.out.println("\n"+numero1+" - "+numero2+" = "+total);
			break;
			
		case 3:
			total = numero1 * numero2;
			System.out.println("\n"+numero1+" * "+numero2+" = "+total);
			break;
			
		case 4:
			total = numero1 / numero2;
			System.out.println("\n"+numero1+" / "+numero2+" = "+total);
			break;
		
		default:
			System.out.println("Operação Inválida!");
			
		}
	}

}