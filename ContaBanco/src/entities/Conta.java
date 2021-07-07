package entities;

public class Conta {

	private double saldo;
	private String name;
	private int numero;
	
	public Conta() {
	}

	public Conta(double saldo, String name, int numero) {
		super();
		this.saldo = saldo;
		this.name = name;
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumero() {
		return numero;
	}
	
	public void deposito(double dinheiro) {
		saldo = saldo + dinheiro;
	}
	public void saque(double dinheiro) {
		saldo = saldo - dinheiro;
	}
	@Override
	public String toString() {
		return "Conta\nsaldo= $" + saldo + ",\nNome= " + name + "\nNumero= " + numero + "";
	}

}
