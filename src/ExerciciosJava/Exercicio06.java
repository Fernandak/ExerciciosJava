package ExerciciosJava;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double x1,x2,y1,y2, distancia;

		System.out.println("Digite posição x1: ");
		x1 = leia.nextDouble();

		System.out.println("Digite posição x2: ");
		x2 = leia.nextDouble();

		System.out.println("Digite posição y1: ");
		y1 = leia.nextDouble();

		System.out.println("Digite posição y2: ");
		y2 = leia.nextDouble();

		distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));


		System.out.println("A distacia: "+distancia);
		leia.close();

	}

}
