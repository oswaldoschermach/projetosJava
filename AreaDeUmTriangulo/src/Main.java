import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double xA, xB, xC, yA, yB, yC;
		double p;
		double areaX, areaY;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as medidas do triangulo X\n");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Insira as medidas do triangulo Y\n");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		areaX = calculaArea(xA, xB, xC);
		areaY = calculaArea(yA, yB, yC);
		
		System.out.println(areaX);
		System.out.println(areaY);
		
		maiorTriangulo(areaX, areaY);

		sc.close();
	}
	public static double calculaArea(double a, double b, double c) {
		double p;
		p = (a + b + c) / 2;
		return Math.sqrt(p*(p - a) * (p - b) * (p - c));
	}
	public static void maiorTriangulo(double areaX, double areaY) {
		if(areaX > areaY)
			System.out.println("Triangulo X e maior");
		else
			System.out.println("Triangulo Y e maior");
	}
	
	
}
