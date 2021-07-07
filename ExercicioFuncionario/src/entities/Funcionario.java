package entities;

public class Funcionario {
	
	public double salario;
	public String nome;
	public double imposto;
	
	public double taxa() {
		return salario = salario - imposto;
	}
	public void aumentaSalario(double porcentagem) {
		double x;
		x = ((salario + imposto) * porcentagem) / 100;
		salario += x;
	}
}
