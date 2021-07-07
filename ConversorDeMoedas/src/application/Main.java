package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double moeda, quantidade, resultado;
		
		System.out.println("Insira a cotação da moeda:");
		moeda = sc.nextDouble();
		System.out.println("Quantidade da moeda a ser comprada:");
		quantidade = sc.nextDouble();
		resultado = CurrencyConverter.converter(moeda, quantidade);
		System.out.println(resultado);
		
		sc.close();
	}

}
