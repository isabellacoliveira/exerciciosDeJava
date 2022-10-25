package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio14 {
	public static void main (String[] args) {
		Scanner uwu = new Scanner(System.in);
		
		     int anoAtual;
		     System.out.println("insira o ano atual: ");
		     anoAtual = uwu.nextInt(); 
		     
		     int anoNascimento;
		     System.out.println("insira o ano de nascimento: ");
		     anoNascimento = uwu.nextInt(); 
		     
		     double idade = anoAtual - anoNascimento; 

		if (idade >= 18) { 
		  System.out.println("você pode votar");  
		  } else if (idade < 18) { 
		  System.out.println("você não pode votar"); 
		  } else { 
		  System.out.println("idade inválida"); 
		  }
		 
	}
}
