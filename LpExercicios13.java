package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicios13 {
	public static void main (String[] args) {
		Scanner uwu =  new Scanner(System.in);
		
		int n1;
		System.out.print("digite o primeiro valor: "); 
		n1 = uwu.nextInt(); 

		int n2;
		System.out.print("digite o segundo valor: "); 
		n2 = uwu.nextInt(); 
	
		int n3;
		System.out.print("digite o terceiro valor: "); 
		n3 = uwu.nextInt(); 
		
		int n4;
		System.out.print("digite o quarto valor: "); 
		n4 = uwu.nextInt(); 
		
		int n5;
		System.out.print("digite o quinto valor: "); 
		n5 = uwu.nextInt(); 
	
		// verificar qual o maior
		if(n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
			System.out.println("o número maior é: " + n1); 
	} else if(n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
		System.out.println("o número maior é: " + n2); 
	} else if(n3 > n2 && n3 > n1 && n3 > n4 && n3 > n5) {
		System.out.println("o número maior é: " + n3); 
	} else if(n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
		System.out.println("o número maior é: " + n4); 
	} else if(n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4) {
		System.out.println("o número maior é: " + n5); 
	} else {
		System.out.println("número inválido");
	}
	 
		// verificar o menor número 
		if(n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
			System.out.println("o número maior é: " + n1); 
	} else if(n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) {
		System.out.println("o número menor é: " + n2); 
	} else if(n3 < n2 && n3 < n1 && n3 < n4 && n3 < n5) {
		System.out.println("o número menor é: " + n3); 
	} else if(n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5) {
		System.out.println("o número menor é: " + n4); 
	} else if(n5 < n1 && n5 < n2 && n5 < n3 && n5 < n4) {
		System.out.println("o número menor é: " + n5); 
	} else {
		System.out.println("número inválido");
	}
	}
}
