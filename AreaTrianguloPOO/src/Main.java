import java.util.Scanner;

import entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as medidas do triangulo X\n");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Insira as medidas do triangulo Y\n");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println(areaX);
		System.out.println(areaY);
		
		sc.close();
	}

}
