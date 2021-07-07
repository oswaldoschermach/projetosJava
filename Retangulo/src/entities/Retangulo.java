package entities;

/*
	classe que contém os metodos e entidades de um retangulo
 */

public class Retangulo {
	
	public double altura;
	public double comprimento;
	
	public double area() { //calcula a area do retangulo
		double area = altura * comprimento;
		return area;
	}
	public double perimetro() { //calcula o perimetro do retangulo
		double perimetro =  (2 * altura) + (2 * comprimento);
		return perimetro;
	}
	public double diagonal() { //faz o calculo da diagonal de um retangulo usando o teorema de pitagoras
		double d = Math.sqrt(Math.pow(altura, 2) + Math.pow(comprimento, 2));
		return d;
	}
}
