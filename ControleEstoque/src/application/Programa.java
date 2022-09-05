package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Produto> setProd = new HashSet<>();
		
		System.out.print("Caminho do arquivo: ");
		String file = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String linha = br.readLine();
					while(linha != null) {
						String[] vec = linha.split(",");
						String nome = vec[0];
						Integer quantidade = Integer.parseInt(vec[1]);
						Double preco = Double.parseDouble(vec[2]);
						
						setProd.add(new Produto(nome,quantidade,preco));
						
						linha = br.readLine();
					}
			
			
			
		}catch (Exception e) {
			System.out.println("Erro: " + e.getStackTrace());
		}
		
		for(Produto prod: setProd) {
			System.out.println("Produto: " + prod.getNome() + ", quantidade: " + prod.getQuantidade() + ", pre�o: R$" + String.format("%.2f", prod.getPreco()));
		}
		
		
		
		sc.close();

	}

}
