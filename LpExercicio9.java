package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio9 {
	public static void main(String [] args) {
		Scanner uwu = new Scanner(System.in); 

		double salario;
		System.out.println("digite o salário: "); 
		salario = uwu.nextDouble(); 

if (salario <= 1200) { 
  System.out.println("insento de desconto");  
} else if (salario >= 1200.01 && salario <= 2500) { 
  double salarioNovo = ((salario * 1.08) - salario); 
  System.out.println("o valor do desconto é " + salarioNovo); 
} else if (salario > 2500) {
    double salarioNovo1 = ((salario * 1.12) - salario); 
   System.out.println(" o valor do desconto é " + salarioNovo1); 
  } 
 }
}
