//2 - Dado um valor inteiro N, verifique as seguintes condi��es: . Se N for impar, exiba
//"Estranho" . Se N for par e for menor que 10, exiba "N�o � estranho" . Se N for par e
//estiver entre 10 e 20, exiba "Estranho" . Se N for par e for maior que 20, exiba
//"N�o � estranho"

package com.juliamello8.atividade;

import java.util.Scanner;

public class Desafio2 {

	public Desafio2() {
		Scanner scanner = new Scanner (System.in);
		int N;
		System.out.println ("Informe o n�mero: ");
		N = scanner.nextInt();
		scanner.close();
		if (N % 2 == 0) {
			if(N < 10){
				System.out.println (String.format ("N�o � Estranho", N));
			} else if (N > 10 && N < 20){
				System.out.println (String.format ("Estranho", N));
			}else if (N > 20){
				System.out.println (String.format ("N�o � Estranho", N));
			}
		}else {
			System.out.println (String.format ("Estranho", N));
		}
		new Desafio3();
	}


	
}
