package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio19 {
	public static void main(String [] args) {
		Scanner uwu = new Scanner(System.in);
    
		int contarMacas;
		System.out.println("digite a quantidade de maças: ");
		contarMacas = uwu.nextInt();
		
if (contarMacas < 12) { 
  double total = contarMacas * 1.30; 
  System.out.println("o custo da compra é " + total + "reais");  
  } else if (contarMacas > 12) { 
  System.out.println("o valor da compra é " + contarMacas + "reais"); 
  } else { 
 System.out.println("quantidade inválida"); 
  }
 }
}

