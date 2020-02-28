package com.juliamello8.atividade;

import java.util.Scanner;

public class Desafio1 {

	public Desafio1() {
		Scanner scanner = new Scanner (System.in);
		int N;
		System.out.println ("Informe o número: ");
		N = scanner.nextInt();
		scanner.close();
		if (N % 2 == 0) {
			System.out.println (String.format ("O número informado %d é par.", N));
		}else {
			System.out.println (String.format ("O número informado %d é ímpar.", N));
		}
		new Desafio2();
	}
	
}
