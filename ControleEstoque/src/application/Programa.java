package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		Produto prod = new Produto();

		System.out.print("Caminho do arquivo: ");
		String file = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String linha = br.readLine();
					while(linha != null) {
						String[] vec = linha.split(",");
						String nome = vec[0];
						Integer quantidade = Integer.parseInt(vec[1]);
						Double preco = Double.parseDouble(vec[2]);
						
						prod.addSet(new Produto(nome,quantidade,preco));	

						
						linha = br.readLine();
					}
					System.out.println();
					System.out.println(prod);
			
			
		}catch (Exception e) {
			System.out.println("Erro: " + e.getStackTrace());
		}
		
		sc.close();

	}

}
