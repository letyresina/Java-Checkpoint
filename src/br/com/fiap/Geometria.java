/* 
 	João Pedro Oliveira Chambrone - RM 97857 
 	Leticia Cristina Gandarez Resina - RM 98069
 */

package br.com.fiap;

public class Geometria {
	// variáveis
	private float base, altura;
	private double raio;
	
	//gets e sets
	
	public float getBase() {
		return base;
	}
	
	public void setBase(float base) {
		try {
			if (base >= 0.0 && base <= 100.0) {
				this.base = base;
			}
			else {
				throw new Exception("Valor da base fora do permitido (0 a 100)");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		try {
			if (altura >= 0.0 && altura <= 100.0) {
				this.altura = altura;
			}
			else {
				throw new Exception("Valor da altura fora do permitido (0 a 100)");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		try {
			if (raio >= 0.0 && raio <= 100.0) {
				this.raio = raio;
			}
			else {
				throw new Exception("Valor do raio fora do permitido (0 a 100)");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// metódos 
	public void calcularAreaQuadrado(float altura) {
		if (altura >= 0.0 && altura <= 100.0) {
			float areaQuadrado = altura * altura;
			
			System.out.println("A área desse quadrado é de: " + areaQuadrado);
		}
	}
	
	public void calcularAreaRetangulo(float base, float altura) {
		if (altura >= 0.0 && altura <= 100.0 && base >= 0.0 && base <= 100.0){
			double areaRetangulo = base * altura;
			
			System.out.println("A área desse quadrado é de: " + areaRetangulo);
		}
	}
	
	public void calcularAreaTriangulo(float base, float altura) {
		if (altura >= 0.0 && altura <= 100.0 && base >= 0.0 && base <= 100.0) {
			double areaTriangulo = (base * altura) / 2;
			
			System.out.println("A área desse triângulo é de: " + areaTriangulo);
		}
	}
	
	public void calcularAreaCirculo(double raio) {
		if (raio >= 0.0 && raio <= 100.0) {
			final double PI = 3.14;
			
			double areaQuadrado = PI * (raio * raio);
			
			System.out.println("A área desse círculo é de: " + areaQuadrado);
		}
	}
	
	
}
