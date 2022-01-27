package ExerciciosJava;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a,b,c,d,e,f,x,y;

		System.out.println("Digite um numero: ");
		a = entrada.nextInt();
		System.out.println("Digite um numero: ");
		b = entrada.nextInt();
		System.out.println("Digite um numero: ");
		c = entrada.nextInt();
		System.out.println("Digite um numero: ");
		d = entrada.nextInt();
		System.out.println("Digite um numero: ");
		e = entrada.nextInt();
		System.out.println("Digite um numero: ");
		f = entrada.nextInt();

		x=((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));

		System.out.println("Valor de X: "+x+" Valor de Y: "+y);
		entrada.close();	

	}

}
