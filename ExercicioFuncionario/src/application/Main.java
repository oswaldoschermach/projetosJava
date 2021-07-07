package application;

import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Insira os dados do funcionario");
		System.out.println("Nome:");
		funcionario.nome = sc.next();
		System.out.println("Salario:");
		funcionario.salario = sc.nextDouble();
		System.out.println("Imposto:");
		funcionario.imposto = sc.nextDouble();
		
		funcionario.taxa();
		
		System.out.println("Dados do funcionario, Nome: "+funcionario.nome+" Salario: "+funcionario.salario);
		System.out.println("Digite a porcentagem a ser aumentada do salário");
		funcionario.aumentaSalario(sc.nextDouble());
		System.out.println("Dados do funcionario, Nome: "+funcionario.nome+" Salario: "+funcionario.salario);
		
	}

}
