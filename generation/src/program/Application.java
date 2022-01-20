package program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int salario, filho, totalSalario = 0, numFilhos = 0,maior = 0,cont = 0;
		double mediaSalario, mediaFilhos, percentual;

		for (int i=0; i<20; i++) {	  
			System.out.print("Digite um salário: ");
			salario = sc.nextInt();    //entrar com o valor do salário
			totalSalario += salario;  //guardar o valor dos salários para calcular a média
			if (salario >maior) {    // calcular qual é o maior
				maior = salario;
			}	
			if (salario<100) {//    verificar quantas pessoas ganham menos de R$ 100,00
				cont += 1;
			}
			System.out.print("Digite quantos filhos a pessoa tem: ");
			filho = sc.nextInt();  // entrar com o número de filhos
			numFilhos += filho;	
		}
		
		mediaSalario = totalSalario/20.0;    //media salarial 
		mediaFilhos = numFilhos/20.0;    //media de filhos
		percentual = (cont/20.0)*100.00;
		
		
		System.out.printf("A média do salário da população é: %.2f%n", mediaSalario);
		System.out.printf("A média do número de filhos é: %.2f%n", mediaFilhos); 
		System.out.println("O maior salário é: R$ " + maior); 
		System.out.printf("O percentual de pessoas com salário até R$100,00 é de: %.2f%n",percentual); 	
		
		sc.close();
	}

}
