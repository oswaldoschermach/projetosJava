package applications;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o numero de quartos a serem locados:");
		int n = sc.nextInt();
		
		Rent[] vet = new Rent[10];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Insira o quarto para locação:");
			int room = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			vet[room] = new Rent(name, email);
		}
		
		for(int i = 0; i < 10; i++) {
			if(vet[i] != null) {
				System.out.println("Quarto: " + i);
				System.out.println(vet[i]);
			}
		}
		sc.close();
	}

}
