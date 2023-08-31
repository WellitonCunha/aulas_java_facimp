package Exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		double media = 0;
		
		do {
			System.out.printf("Informe a %d nota: ",i);
			double nota = sc.nextDouble();
			media += nota /4;
			i++;
		}while(i <= 4);
			if(media >= 6)
				System.out.printf("Aprovado media igual: %f",media);
			else
				System.out.printf("Reprovado média igual: %f",media);
		
		sc.close();

	}

}
