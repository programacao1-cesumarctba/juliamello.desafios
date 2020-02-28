//4 - Crie um programa que receba um valor numerico inteiro N, e calcule a
//tabuada completa desse numero de 1 até 10. Imprimindo linha a linha da
//tabuada. 2 x 1 = 2 2 x 2 = 4 2 x 3 = 6...

package com.juliamello8.atividade;

import java.util.Scanner;

public class Desafio4 {

	public Desafio4() {
		Scanner scanner = new Scanner (System.in);
		int N;
		int resul;
		int i = 1;
		System.out.println ("Informe um número: ");
		N = scanner.nextInt();
		scanner.close();
		for(i=1 ; i<11; i++){
			resul = N * i;
			System.out.println (String.format ("%d * %d = %d", N, i, resul));
		}
	}
	

}

