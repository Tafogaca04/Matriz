package Matriz;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new  Scanner (System.in);

		int soma =0, valor;
		int m [] [] =new int [5] [5];

		for (int i=0; i<5; i++)	{
			for (int j=0;j<5;j++) {
			valor= (int)Math.round(Math.random()*2);

				if ( valor% 2 == 0 ) {
					m[i][j]= valor;
					soma = soma + m [i] [j];
				
				}
			}

		}
		for (int i=0; i<5; i++)	{
			for (int j=0;j<5;j++) {
				System.out.println("Os valores são:" +  m [i] [j] );
			}
			
		}

		System.out.println("O resultado da soma é:" + soma );
		ler.close();
	}

}
