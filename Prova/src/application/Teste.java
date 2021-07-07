package application;

class Pessoa{
	 Pessoa(String s,int i){
	 ++id;
	 nome=s;
	 idade=i;
	 }
	 static int id;
	 int idade;
	 String nome;
	}

class Teste{
	 public static void main(String args[]){
	 Pessoa p1 = new Pessoa("Joao" , 22);
	 Teste te = new Teste();
	 Pessoa p2 = te.mudar(p1);
	 System.out.print(p2.id + " " + p2.nome + " " + p2.idade + " ");
	 System.out.print(p1.id + " " + p1.nome + " " + p1.idade);
	 }
	 private Pessoa mudar(Object o){
	 Pessoa p2 = (Pessoa)o;
	 p2.idade = 25;
	 return p2;
	 }
	}
