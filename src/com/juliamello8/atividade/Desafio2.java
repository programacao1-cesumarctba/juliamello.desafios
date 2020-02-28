//2 - Dado um valor inteiro N, verifique as seguintes condições: . Se N for impar, exiba
//"Estranho" . Se N for par e for menor que 10, exiba "Não é estranho" . Se N for par e
//estiver entre 10 e 20, exiba "Estranho" . Se N for par e for maior que 20, exiba
//"Não é estranho"

package com.juliamello8.atividade;

import java.util.Scanner;

public class Desafio2 {

	public Desafio2() {
		Scanner scanner = new Scanner (System.in);
		int N;
		System.out.println ("Informe o número: ");
		N = scanner.nextInt();
		scanner.close();
		if (N % 2 == 0) {
			if(N < 10){
				System.out.println (String.format ("Não é Estranho", N));
			} else if (N > 10 && N < 20){
				System.out.println (String.format ("Estranho", N));
			}else if (N > 20){
				System.out.println (String.format ("Não é Estranho", N));
			}
		}else {
			System.out.println (String.format ("Estranho", N));
		}
		new Desafio3();
	}


	
}
