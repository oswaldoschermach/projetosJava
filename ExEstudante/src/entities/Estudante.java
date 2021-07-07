package entities;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;

	public void calculaMedia() {
		media = (nota1 + nota2 + nota3) / 3;
	}
	public void resultado() {
		if (media >= 6)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");
	}
}
