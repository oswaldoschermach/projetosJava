package application;

import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		for(int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.println("Insira o nome do produto");
			String nome = sc.nextLine();
			System.out.println("Insira o valor do produto");
			double valor = sc.nextDouble();
			vetor[i] = new Produto(nome, valor);
		}
		
		double soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getValor();
		}
		
		System.out.println(soma / vetor.length);
		
		sc.close();
	}

}
