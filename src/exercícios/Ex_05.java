package exerc�cios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Digite um valor inteiro: ");
			int n = sc.nextInt();
			
			int soma = n + 1;
			
			System.out.println("O n�mero digitado foi: " + n);
			System.out.println("O pr�ximo inteiro �: " + soma);
		}
		catch (Exception e) {
			System.out.println("Insira apenas n�meros inteiros");
		}
		finally {
			sc.close();
		}
		
	}
	
}
