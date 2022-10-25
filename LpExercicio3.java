package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio3 {
	public static void main(String [] args) throws java.io.IOException {
		
		Scanner uwu = new Scanner(System.in); 
		
		double altura;
		System.out.println("Digite a altura: ");
		altura = uwu.nextDouble(); 
		
		String nome;
		System.out.println("Digite o nome: "); 
		nome = uwu.nextLine();
		
		char sexo;
		System.out.println("Informe seu sexo (M: mulher, H: homem)"); 
		sexo = (char)System.in.read();
		
		
		if ((sexo == 'M') || (sexo == 'm')) {
			double alturamulher = (62.1 * altura) - 44.7;
				System.out.println("seu peso ideal é " + alturamulher);
			} else if ((sexo == 'H') || (sexo == 'h')){
				double alturahomem = (72.7 * altura) - 58;
				System.out.println("seu peso ideal é " + alturahomem);
	    } else {
	    	System.out.println("caracter inválido"); 
	    }
      }
}
