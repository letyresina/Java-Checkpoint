/* 
 	João Pedro Oliveira Chambrone - RM 97857 
 	Leticia Cristina Gandarez Resina - RM 98069
 */

package br.com.fiap;

import java.util.Scanner;

public class UsaGeometria {

	public static void main(String[] args) {
		// variaveis 
		int opcao;
		float base, altura;
		double raio;
		
		// instanciando classes
		Scanner scan = new Scanner(System.in);
		Geometria geo = new  Geometria();
		
		try {
			
			// fazendo menu
			System.out.println("Menu de opções");
			System.out.println("\n 1 - Calcular área do quadrado; \n 2 - Calcular área do retângulo;"
					+ "\n 3 - Calcular área do triângulo; \n 4 - Calcular área do círculo;");
			
			System.out.println("Escolha uma opção");
			opcao = scan.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o valor da altura do quadrado (0 a 100)");
				altura = scan.nextFloat();
				
				geo.setAltura(altura);
				
				geo.calcularAreaQuadrado(altura);
			}
			
			else if (opcao == 2) {
				System.out.println("Digite o valor da altura do retângulo (0 a 100)");
				altura = scan.nextFloat();
				
				
				
				System.out.println("Digite o valor da base do retângulo (0 a 100)");
				base = scan.nextFloat();
				
				geo.setAltura(altura);
				geo.setBase(base);
				
				geo.calcularAreaRetangulo(base, altura);
			}
			
			else if (opcao == 3) {
				System.out.println("Digite o valor da altura do triângulo (0 a 100)");
				altura = scan.nextFloat();
				
				System.out.println("Digite o valor da base do triângulo (0 a 100)");
				base = scan.nextFloat();
				
				geo.setAltura(altura);
				geo.setBase(base);
				
				geo.calcularAreaTriangulo(base, altura);
			}
			
			else if (opcao == 4) {
				System.out.println("Digite o valor do raio do círculo (0 a 100)");
				raio = scan.nextDouble();
				
				geo.setRaio(raio);
				
				geo.calcularAreaCirculo(raio);
			}
			
			else {
				System.out.println("Opção inválida");
			}	
			
		} catch (Exception e) {
			System.out.println("Formato inválido. Tente novamente");
		}
	}

}
