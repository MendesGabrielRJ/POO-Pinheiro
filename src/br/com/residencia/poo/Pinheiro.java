package br.com.residencia.poo;

import java.util.Scanner;

public class Pinheiro {

	
			public static void main(String[] args) {
			byte tamanho;
			
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite um número entre 3 e 50: ");
			tamanho = ler.nextByte();

			
			for (int i = 0; i < tamanho; i++) {
				for (int j = i; j < tamanho; j++) {
					
				System.out.print(" ");
				}
			

				
				System.out.print("*");
				
			for (int j = 0; j < i; j++) {
				
				System.out.print("**");
				}	
				

				
				System.out.print("\n");
			    }

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < tamanho - 1; j++) {
					
				System.out.print(" ");
				}
				
				System.out.print(" *\n");
				ler.close();
				
			}

		}
	}