// exercicio 22
package linguagemDeProgamacao;

import java.util.Scanner;

public class LpExercicios {
	public static void main (String [] args) {
		
		Scanner uwu = new Scanner(System.in); 
		
		String nome = ""; 
		System.out.println("Digite o nome do funcionário: "); 
		nome = uwu.nextLine() ;
		
		double salfixo; 
		System.out.println("Digite o salário fixo: "); 
		salfixo = uwu.nextInt(); 
		
		double totalVenda = 200; 
		System.out.println("Digite o total de vendas: "); 
		totalVenda = uwu.nextInt(); 
		 
		double comissao1 = 1.03; 
		double comissao2 = 1.05; 
		
		if(totalVenda <= 1500) {
			double salarioFinal = (salfixo * comissao1);
			System.out.println("o salário total é " + salarioFinal); 
		} else if (totalVenda > 1500) {
			double salarioFinal2 = (salfixo * comissao2); 
			System.out.println("o salário total é " + salarioFinal2); 
		} else {
			System.out.println("número inválido");
		}
	}
}
