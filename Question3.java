package Atividade;

import java.util.Scanner;

public class Question3 {
	public static void main (String[]args) {
		
		int age=0, lessThan21=0, greaterThan50=0;
		Scanner reader = new Scanner (System.in);
		
		while(age!=99) {
			System.out.println("Digite uma idade: ");
			age = reader.nextInt();
			
			if(age<21) {
				lessThan21++;
			}
			else if(age>=21) {
				greaterThan50++;
			}
		}
		System.out.println("Número de pessoas com menos de 21 anos: "+lessThan21);
		System.out.println("Número de pessoas com mais de 50 anos: "+greaterThan50);
	}
}
