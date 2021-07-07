package appplication;

import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		//para converter uma string para enum
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		String s = sc.nextLine(); //PARA LER UMA STRING DO TECLADO
		
		OrderStatus os2 = OrderStatus.valueOf(s); //CONVERTE A STRING DO TECLADO NO ENUM CORRESPONDENTE
		
		System.out.println(os2);
		
	}

}
