package application;

import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //cria um objeto Scanner para ser usado no programa
		
		Retangulo retangulo; //declara uma variável do tipo retangulo
		retangulo = new Retangulo(); //instancia a variável, criando um objeto
		
		System.out.println("Insira a altura do retangulo");
		retangulo.altura = sc.nextDouble();
		System.out.println("Insira o comprimento do retangulo");
		retangulo.comprimento = sc.nextDouble();
		
		System.out.println("Area do retangulo:" + retangulo.area());
		System.out.println("Perimetro do retangulo:" + retangulo.perimetro());
		System.out.println("Diagonal do retangulo" + retangulo.diagonal());
		
		sc.close(); //desaloca o scanner
	}

}
