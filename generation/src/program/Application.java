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
			System.out.print("Digite um sal�rio: ");
			salario = sc.nextInt();    //entrar com o valor do sal�rio
			totalSalario += salario;  //guardar o valor dos sal�rios para calcular a m�dia
			if (salario >maior) {    // calcular qual � o maior
				maior = salario;
			}	
			if (salario<100) {//    verificar quantas pessoas ganham menos de R$ 100,00
				cont += 1;
			}
			System.out.print("Digite quantos filhos a pessoa tem: ");
			filho = sc.nextInt();  // entrar com o n�mero de filhos
			numFilhos += filho;	
		}
		
		mediaSalario = totalSalario/20.0;    //media salarial 
		mediaFilhos = numFilhos/20.0;    //media de filhos
		percentual = (cont/20.0)*100.00;
		
		
		System.out.printf("A m�dia do sal�rio da popula��o �: %.2f%n", mediaSalario);
		System.out.printf("A m�dia do n�mero de filhos �: %.2f%n", mediaFilhos); 
		System.out.println("O maior sal�rio �: R$ " + maior); 
		System.out.printf("O percentual de pessoas com sal�rio at� R$100,00 � de: %.2f%n",percentual); 	
		
		sc.close();
	}

}
