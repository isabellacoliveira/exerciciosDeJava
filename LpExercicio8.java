package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio8 {
	public static void main(String [] args) {
		Scanner uwu = new Scanner(System.in); 

		int idade1;
		System.out.println("digite a idade da primeira pessoa"); 
		idade1 = uwu.nextInt();
		
		int idade2;
		System.out.println("digite a idade da segunda pessoa"); 
		idade2 = uwu.nextInt();
		
		int idade3 = 70;
		System.out.println("digite a idade da terceira pessoa"); 
		idade3 = uwu.nextInt();
		
		double media = (idade1 + idade2 + idade3) / 3; 

if (media > 50) { 
  System.out.println("a média é maior que 50 anos: " + media); 
} else { 
  System.out.println("a média não é maior que 50 anos, a média é: " + media); 
  } 
 }
}
