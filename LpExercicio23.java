package linguagemDeProgamacao;

import java.util.Scanner;

public class LpExercicio23 {
	public static void main (String [] args) throws java.io.IOException {
		
		Scanner uwu = new Scanner(System.in); 
		
		double litros;
		System.out.println("digite a quantidade de litros :"); 
		litros = uwu.nextDouble(); 
		
		char tipo;
		System.out.println("digite o tipo do combustível (G: gasolina, A: álcool)");
		tipo = (char)System.in.read(); 
		
		if ((tipo == 'a') || (tipo == 'A')) {
			// 1 litro de alcool é R$ 1,90 
			if(litros <= 20) {
				double pagamentoDoCliente = ((0.97) * litros) * 1.90; 
				System.out.println("O valor a ser pago é " + pagamentoDoCliente); 
			} else if (litros > 20) {
				double pagamentoDoCliente2 = ((0.95) * litros) * 1.90;
				System.out.println("O valor a ser pago é " + pagamentoDoCliente2); 
			} else {
				System.out.println("número inválido");
			}
		} else if ((tipo == 'g') || (tipo == 'G')) {
			// 1 litro de gasolina é R$ 2,20 
			if(litros <= 20) {
				double pagar =((0.96) * litros) * 2.20; 
				System.out.println("O valor a ser pago é " + pagar); 
			} else if (litros > 20) {
				double pagar2 = ((0.94) * litros) * 2.20; 
				System.out.println("O valor a ser pago é " + pagar2);
			} else {
				System.out.println("número inválido"); 
			}
		} else  {
			System.out.println("caractér inválido"); 
		}
			
	}
}
