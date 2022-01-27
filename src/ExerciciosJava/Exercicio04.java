package ExerciciosJava;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double  R,S,D;
		int A,B,C;

		System.out.println("Digite primeiro numero: ");
		A = leia.nextInt();

		System.out.println("Digite segundo numero: ");
		B = leia.nextInt();

		System.out.println("Digite terceiro numero: ");
		C = leia.nextInt();

		R=(A+B)^2;
		S=(B+C)^2;
		D=(R+S)/2;

		System.out.println("Resultado da expressão: "+D);

		leia.close();

	}
}
