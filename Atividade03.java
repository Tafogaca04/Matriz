package Matriz;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new  Scanner (System.in);

		int m [] [] =new int [4] [4];

		for (int i=0; i<4; i++)	{
			for (int j=0;j<4;j++) {

				if(i==j){
					m[i][j] = (int)Math.round(Math.random()*6);
				}

			}
		}
		for (int i=0; i<4; i++)	{
			for (int j=0;j<4;j++) {

				System.out.println("Posição" +i+","+j +"  " + m[i][j]);
			}

		}
		
	}



}

