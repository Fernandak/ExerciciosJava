package ExerciciosJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade,ano=365, mes=30 , dia, mesnasc, dias,anonasc,anoatual=2022;

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Digite o dia que voce nasceu: ");
		dia = leia.nextInt();
		
		System.out.println("Digite o mês que voce nasceu: ");
		mesnasc = leia.nextInt();
		
		anonasc = 2022-idade;
		dias =(idade * ano) + (mesnasc * mes)+ dia;
		System.out.println("Sua idade em dias: "+dias);


		leia.close();

	}

}
