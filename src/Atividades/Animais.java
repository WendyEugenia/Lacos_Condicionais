package Atividades;

import java.util.Scanner;

public class Animais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		String palavra1, palavra2, palavra3;
		
		System.out.println("\n Informe a Palavra 1: ");
		palavra1 = leia.next();
		System.out.println("\n Informe a Palavra 2: ");
		palavra2 = leia.next();
		System.out.println("\n Informe a Palavra 3: ");
		palavra3 = leia.next();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("\n É uma guia");
				}else {
					System.out.println("\n É uma pomba");
				}
			}else if(palavra3.equalsIgnoreCase("onivoro")) {
				System.out.println("\n Homem");
		}else {
			System.out.println("\n É uma vaca");
			}
		}else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hermatófago")) {
					System.out.println("\n É uma pulga");
			}else {
				System.out.println("\n É uma largata");
			}
		}else {
			if(palavra3.equalsIgnoreCase("hematofago")) {
				System.out.println("\n É uma sanguessuga");
			}else 
				System.out.println("\n É uma minhoca");
			}
		}
	}
}
