package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class valordeumraiodecirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double R;
		double A;
		double pi = 3.14159;
		
		R = sc.nextDouble();
		A = pi * R * R;
		
		System.out.printf("A área é: %.4f%n", A);
		
		sc.close();

	}

}
