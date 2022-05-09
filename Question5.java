package Atividade;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int number, sum = 0;

		do {
			System.out.println("Digite um número: ");
			number = reader.nextInt();
			sum += number;
		} while (number != 0);

		System.out.println("A soma dos números é " + sum);
	}
}
