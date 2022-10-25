package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio24 {
	public static void main (String [] args) {
		
		Scanner uwu = new Scanner(System.in);
	
		int idadeHomem1;
		System.out.println("Digite a idade do homem 1: ");
		idadeHomem1 = uwu.nextInt();
		
		int idadeHomem2;
		System.out.println("Digite a idade do homem 2: "); 
		idadeHomem2 = uwu.nextInt(); 
		
		int idadeMulher1;
		System.out.println("Digite a idade da mulher 1: "); 
		idadeMulher1 = uwu.nextInt();
		
		int idadeMulher2;
		System.out.println("Digite a idade da mulher 2: ");
		idadeMulher2 = uwu.nextInt(); 
		
		if(idadeHomem1 > idadeHomem2) {
			if(idadeMulher1 > idadeMulher2) {
				int soma1 = idadeHomem1 + idadeMulher1; 
				System.out.println(soma1); 
			} else {
				int soma2 = idadeHomem1 + idadeMulher2; 
				System.out.println(soma2); 
			}
		} else {
			if (idadeMulher1 > idadeMulher2) {
				int soma3 = idadeHomem2 + idadeMulher2; 
				System.out.println(soma3); 
			} else {
				int soma4 = idadeHomem2 + idadeMulher1; 
				System.out.println(soma4); 
			}
		}
		
		if (idadeHomem1 > idadeHomem2) {
			if(idadeMulher1 > idadeMulher2) {
				int multi1 = idadeHomem2 * idadeMulher1; 
				System.out.println(multi1);
			} else {
				int multi2 = idadeHomem2 * idadeMulher2; 
				System.out.println(multi2);
			}
		} else {
			if(idadeMulher1 > idadeMulher2) {
				int multi3 = idadeHomem1 * idadeMulher1; 
				System.out.println(multi3); 
			} else {
				int multi4 = idadeHomem1 * idadeMulher2; 
				System.out.println(multi4);
			}
		}
		
	} 
}
