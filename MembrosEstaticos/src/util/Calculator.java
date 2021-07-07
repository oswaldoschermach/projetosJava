package util;

public class Calculator {
	public static final double PI = 3.14159; // para declarar uma constante, assim como o #define em C

	
	//membro estatico nao precisa de um objeto para ser chamado
	public static double circumference(double radius) { 
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}