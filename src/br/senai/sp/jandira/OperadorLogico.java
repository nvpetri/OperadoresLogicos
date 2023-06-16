package br.senai.sp.jandira;

import java.util.Scanner;

public class OperadorLogico {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int x = teclado.nextInt() ;
		
		if (x >= 100 && (x % 2) == 1) {
			System.out.println("O valor é impar e maior do que 100");
		} else {
			System.out.println("ESTE VALOR EU NÃO QUERO!!!");
		};
		

	}

}
