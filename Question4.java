package Atividade;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int i=0,age,gender,personality,countCalmPeople=0,
				nervousWomen=0,aggressiveMen=0,othersCalm=0,
						peopleOver40Nervous=0,peopleUnder18Calm=0;
		Scanner reader = new Scanner (System.in);
		
		while(i<=150) {
			System.out.println("Qual a sua idade? ");
			age = reader.nextInt();
			System.out.println("Qual o seu sexo?\n1-masculino\n2-feminino\n3-outros");
			gender = reader.nextInt();
			System.out.println("Você é uma pessoa: \n1-calma\n2-nervosa\n3-agressiva");
			personality = reader.nextInt();
			if(personality == 1) {
				countCalmPeople++;
			}
			if(gender==1 && personality==2) {
				nervousWomen++;
			}
			if(gender==2 && personality==3) {
				aggressiveMen++;
			}
			if(gender == 3 && personality==1) {
				othersCalm++;
			}
			if(age>40 && personality==2) {
				peopleOver40Nervous++;
			}
			if(age<18 && personality==1) {
				peopleUnder18Calm++;
			}
		}
		System.out.println("número de pessoas calmas: "+countCalmPeople);
		System.out.println("número de mulheres nervosas: "+nervousWomen);
		System.out.println("número de homens agressivos: "+aggressiveMen);
		System.out.println("número de outros calmos: "+othersCalm);
		System.out.println("número de pessoas nervosas com mais de 40 anos: "+peopleOver40Nervous);
		System.out.println("número de pessoas calmas com menos de 18 anos: "+peopleUnder18Calm);
	}

}
