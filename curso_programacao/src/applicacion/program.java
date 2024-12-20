\\ Soft_de_Entrada_e_Saida_de_produtos


package applicacion;

import java.util.Locale;
import java.util.Scanner;

import entitys.Products;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Products product = new Products();
		System.out.println("Coloque os dados do produto");
		System.out.println("Nome");
		product.name = sc.nextLine();
		System.out.println("Preco");
		product.price = sc.nextDouble();
		System.out.println("Quantidade no Estoque");
		product.quantity = sc.nextInt();
		
			
			System.out.println("Dados do produto " +product);
	
			System.out.print("Coloque o numero de produtos para ser adicionados ao estoque");
			
			int quantity = sc.nextInt();
			product.addProducts(quantity);
			
			System.out.println("Dados do produto atualizados " + product);
			
			System.out.println();
			System.out.print("Coloque o numero de produtos para ser removidos do estoque");
			quantity = sc.nextInt();
			product.removeProducts(quantity);
			
			System.out.println();
			System.out.println("Dados do produto atualizados " + product);
			
			sc.close();
		
		
	}

}
