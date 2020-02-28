package com.juliamello8.atividade;

import java.util.Scanner;

public class Desafio3 {

	public Desafio3() {
		Scanner scanner = new Scanner (System.in);
		int N;
		int i = 0;
		System.out.println ("Informe um número: ");
		N = scanner.nextInt();
		scanner.close();
		int resul = N;
		
		for(i = 1; i < N; i++) {
			resul = resul * i;
			System.out.println(String.format("O fatorial do número inserido é: %d",resul));			
		}
		new Desafio4();
	}

}
