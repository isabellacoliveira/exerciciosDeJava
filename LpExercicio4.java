package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio4 {
	public static void main(String [] args) {
		
		Scanner uwu = new Scanner(System.in); 
		
		int idade; 
		System.out.println("Digite a idade: ");
		idade = uwu.nextInt(); 
		
		if (idade >=5 && idade <= 7) {
				System.out.println("categoria infantil A");
			} else if (idade >= 8 && idade <= 11) {
				System.out.println("categoria infantil B"); 
			} else if (idade >= 12 && idade <= 13) { 
				System.out.println("categoria juvenil A"); 
			} else if  (idade >= 14 && idade <= 17) { 
				System.out.println("categoria juvenil B"); 
			}  else if(idade >= 18) { 
				System.out.println("categoria adulto"); 
			}
	}
}

