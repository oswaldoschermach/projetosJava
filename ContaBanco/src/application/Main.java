package application;

import java.util.Scanner;
import entities.Conta;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		String nome;
		int numero;
		double dinheiro = 0;
		char escolha;

		System.out.println("Fa?a o cadastro de sua conta\n");
		System.out.println("Insira o numero da conta");
		numero = sc.nextInt();
		System.out.println("Nome completo:");
		sc.nextLine();
		nome = sc.nextLine();
		System.out.println("Deseja fazer um deposito? (s / n)");
		escolha = sc.next().charAt(0);

		if (escolha == 's') {
			System.out.println("Insira a quantia a ser depositada: ");
			dinheiro = sc.nextDouble();
		} else
			System.out.println("Voc? escolheu nao depositar\n");

		conta = new Conta(dinheiro, nome, numero);

		System.out.println(conta);

		System.out.println("Quantidade a ser depositada");
		dinheiro = sc.nextDouble();
		conta.deposito(dinheiro);
		System.out.println(conta);
		
		System.out.println("Quantidade a ser sacada");
		dinheiro = sc.nextDouble();
		conta.saque(dinheiro);
		System.out.println(conta);

		sc.close();

	}

}
