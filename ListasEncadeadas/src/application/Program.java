package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		//lista s� aceitam wrapper classes
		
		List<String> list = new ArrayList<>(); //faz a instancia��o da lista
		
		
		list.add("Maria"); //fun��o que faz a adi��o de um valor a lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //adiciona um elemento na posi��o informada
		
		System.out.println(list.size()); //size() serve para saber o tamanho da lista
		
		for (String x : list) { //imprime a lista
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M'); //faz a remo��o de um elemento da lista conform o parametro
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //encontra a posi��o de um determinado elemento
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------------");
		
		/*
		 * Faz uma filtragem na lista
		 * faz uma transforma��o com a fun��o stream() e faz um filtro com a fun��o filter()
		 * depois converte pra lista novamente usando o collect
		 */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		/*
		 * Encontra a primeira ocorrencia na lista utilizando o findFirst() 
		 */
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}