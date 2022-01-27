package ExerciciosJava;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double total,impostos,distribuidor,custofabrica;


		System.out.println("Digite valor do carro: ");
		custofabrica = leia.nextDouble();

		impostos = (45*custofabrica) / 100;
		distribuidor = (28*custofabrica)/100;
		total =custofabrica+impostos+distribuidor;


		System.out.println("Valor do carro com juros: "+total);
		leia.close();
	}

}
