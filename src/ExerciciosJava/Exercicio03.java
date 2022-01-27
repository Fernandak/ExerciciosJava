package ExerciciosJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int segundos,horas, minutos;

		System.out.println("Duração do evento em segundos: ");
		segundos =leia.nextInt();

		horas = segundos / 3600;
		minutos = (segundos+(horas*3600))/60;
		segundos = segundos %3600;

		System.out.println(+horas+" Horas "+minutos+" Minutos "+segundos+" Segundos ");
		leia.close();

	}

}
