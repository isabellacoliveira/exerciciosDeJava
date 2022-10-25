package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio5 {
	public static void main(String [] args) {
		
		Scanner uwu = new Scanner(System.in); 
		
		String nome; 
		System.out.println("digite o nome do funcionário: "); 
		nome = uwu.nextLine(); 
		
		int codigo;
		System.out.println("digite o código: "); 
		codigo = uwu.nextInt(); 
		
		double salario = 1000;

		switch(codigo) {
				case 1: 
					double aumentarSalario = salario * 1.50; 
					System.out.println("Escriturário: o novo salário é " + aumentarSalario);
					break; 
				
				case 2: 
					double aumentarSalario1 = salario * 1.35; 
					System.out.println("Secretario: o novo salário é " + aumentarSalario1);
					break;
				
				case 3: 
					double aumentarSalario2 = salario * 1.20; 
					System.out.println("Caixa: o novo salário é " + aumentarSalario2);
					break;

				case 4: 
					double aumentarSalario3 = salario * 1.10; 
					System.out.println("o novo salário é " + aumentarSalario3);
					break; 
					
				case 5:  
					System.out.println("Diretor: não tem aumento, o salário é " + salario);
					break; 

				default: 
					System.out.println("código inválido"); 
					break; 
  }
 }
}
