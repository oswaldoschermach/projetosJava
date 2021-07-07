package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vet = new Product[n];
		
		for(int i = 0; i < vet.length; i++) {
			sc.nextLine(); //para comer a quebra de linha
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vet[i] = new Product(name, price);			
		}
		
		double soma = 0;
		
		for(int i = 0; i < vet.length; i++) {
			soma += vet[i].getPrice();
		}
		
		System.out.println(soma);
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		sc.close();
	}

}
