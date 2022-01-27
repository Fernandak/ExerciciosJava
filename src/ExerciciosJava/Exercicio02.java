package ExerciciosJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, dia, mesnasc, anonasc;

		System.out.println("Digite sua idade em dias: ");
		idade = leia.nextInt();
	
		anonasc =2022-(idade/365);
		mesnasc=(idade % 365)/ 30;
		dia=(idade % 365)% 30;

		System.out.println("Dia: "+dia+" Mês: "+mesnasc+" Ano: "+anonasc);

		leia.close();

	}

}
