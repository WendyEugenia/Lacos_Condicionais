package Atividades;

import java.util.Scanner;

public class MenuLanchonete {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int op, quantidade, total;
		
		System.out.println("\n Lanchonete:");
		System.out.println("\n1 - Cachorro Quente - R$10,00");
		System.out.println("\n2 - X-Salada        - R$15,00");
		System.out.println("\n3 - X-Bacon         - R$18,00");
		System.out.println("\n4 - Bauru           - R$12,00");
		System.out.println("\n5 - Refrigerante    - R$08,00");
		System.out.println("\n6 - Suco de laranja - R$13,00");
		System.out.println("\n Digite o código do Produto: ");
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println("\nDigite a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*10;
			System.out.println("\nProduto: "+quantidade+" Cachorro Quente"+"\nValor total: R$"+total+",00");
			break;
			
		case 2:
			System.out.println("\nDigite a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*15;
			System.out.println("\nProduto: "+quantidade+" X-Salada"+"\nValor total: R$"+total+",00");
			break;	
			
		case 3:
			System.out.println("\nInsira a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*18;
			System.out.println("\nProduto: "+quantidade+" X-Bacon"+"\nValor total: R$"+total+",00");
			break;
			
		case 4:
			System.out.println("\nDigite a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*12;
			System.out.println("\nProduto: "+quantidade+" Bauru"+"\nValor total: R$"+total+",00");
			break;
			
		case 5:
			System.out.println("\nDigite a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*8;
			System.out.println("\nProduto: "+quantidade+" Refrigerante"+"\nValor total: R$"+total+",00");
			break;
		
		case 6:
			System.out.println("\nDigite a quantidade:");
			quantidade = leia.nextInt();
			total = quantidade*13;
			System.out.println("\nProduto: "+quantidade+" Suco de laranja"+"\nValor total: R$"+total+",00");
			break;
			
		default:
			System.out.println("\nEscolha o codigo do Produto:");
			
		}
	}

}