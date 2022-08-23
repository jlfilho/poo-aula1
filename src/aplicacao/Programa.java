package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto prod1; 
		prod1= new Produto();
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		prod1.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		prod1.preco = sc.nextDouble();
		
		System.out.print("Quantidade em Estoque: ");
		prod1.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: "+prod1);
		
		System.out.println();
		System.out.println("Entre com a qtd de produtos a ser adiocionado no estoque: ");
		prod1.adiconarQuantidade(sc.nextInt());
		
		System.out.println();
		System.out.println("Dados atualizados: "+prod1);
		
		System.out.println();
		System.out.println("Entre com a qtd de produtos a ser removido do estoque: ");
		prod1.removerProduto(sc.nextInt());
		
		System.out.println();
		System.out.println("Dados atualizados: "+prod1);
		
		System.out.println();
		System.out.println("Entre com a qtd de produtos a ser removido do estoque: ");
		prod1.removerProduto(sc.nextInt());
		
		
		sc.close();
	
	}

}
