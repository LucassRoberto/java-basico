package program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int salario, filho;
		double mediaSalario, mediaFilhos;
		
		System.out.print("Digite um salário: ");
		salario = sc.nextInt();
		
		int totalSalario = 0;
		for (int i=1; i<3; i++) {
			
			totalSalario = totalSalario + salario;
			System.out.print("Digite um salário: ");
			salario = sc.nextInt();
			
		}
		System.out.println(totalSalario);
		
		
		
		
		sc.close();
	}

}
