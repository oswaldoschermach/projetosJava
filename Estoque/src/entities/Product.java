package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // o this serve para referenciar a classe
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() { // transforma tudo em string para depois jogar na tela
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "  //string.format
				+ String.format("%.2f", totalValueInStock());										//serve para formatar a string
	}																								//parecido com o printf();
}