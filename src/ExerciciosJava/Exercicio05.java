package ExerciciosJava;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int nota1,nota2,nota3,media;

		System.out.println("Digite a primeira nota: ");
		nota1 =leia.nextInt();

		System.out.println("Digite a segunda nota: ");
		nota2 =leia.nextInt();

		System.out.println("Digite a terceira nota: ");
		nota3 =leia.nextInt();

		media= (nota1*1)+(nota2*2)+(nota3*5)/10;
		

		System.out.println("A média ponderada: "+media);
		leia.close();

	}

}
