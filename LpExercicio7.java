package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio7 {
	public static void main(String [] args) {
		Scanner uwu = new Scanner(System.in); 

		 String nome;
	     System.out.println("digite o nome do aluno: ");
	     nome = uwu.nextLine(); 
	     
		 int nota1;
		 System.out.println("digite a nota 1: "); 
		 nota1 = uwu.nextInt(); 
		 
	     int nota2;
	     System.out.println("digite a nota 2: ");
	     nota2 = uwu.nextInt(); 
	     
	     int nota3; 
	     System.out.println("digite a nota 3: ");
	     nota3 = uwu.nextInt(); 
	     
	     int nota4;
	     System.out.println("digite a nota 4: ");
	     nota4 = uwu.nextInt(); 
	     
	     double notaExame; 
	     double media = (nota1 + nota2 + nota3 + nota4) / 4;
	     

      	if(media >= 7) { 
      		System.out.println("aprovado com: " + media); 
      	} else  {

      		System.out.println("Digite a nota do exame"); 
      		notaExame = uwu.nextInt( ); 
      		double mediaNova = (notaExame + media) / 2; 
      		
      		if (mediaNova >= 5) { 
      			System.out.println("aprovado em exame com: " + mediaNova); 
      		} else { 
      			System.out.println("o aluno não foi aprovado, está com:  " + mediaNova); 
      		}
      		
      	}
	}
}

	
