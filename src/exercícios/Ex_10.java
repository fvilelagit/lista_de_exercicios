package exerc�cios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_10 {

	// Esse pegou.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Insira um n�mero: ");
		int n = sc.nextInt();
		int r; 
		String numB = "";
		while (n > 32) {
			System.out.println("Insira um n�mero menor que 32");
			n = sc.nextInt();
		}
		
		while (n/2 > 1) {
			r = n%2;
			// char a = (char) r; N�o imprime valor algum.
 			numB = numB + String.valueOf(r);  
			n = n/2;
			System.out.println(n);
		}
		System.out.println(numB + ".");
		int numBinario = Integer.parseInt(numB); // Se o bin�rio for 0000 o inteiro vale 0.
		System.out.println("O resultado em bin�rio �: " + numBinario);

		sc.close();
	}
	
	
}
