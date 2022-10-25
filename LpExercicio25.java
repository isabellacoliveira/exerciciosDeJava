/*
 * uma fruteira está vendendo frutas com a seguinte tabela de preços: 
 * 					até 5kg 				acima de 5kg 
 * morango		R$ 2.50 por kg				R$2.20 por kg
 * maça 		R$ 1.80 por kg 				R$1.50 por kg 
 * 
 * se o cliente comprar mais de 8kg em frutas ou o valor total da compra ultrapassar R$ 25.00 receberá
 * um desconto de 10% sobre esse total. Escreva um algoritmo para ler a quantidade (em kg) de morangos e
 * a quantidade (em kg) de maças adquiridas e escreva o valor a ser pago pelo cliente 
 * */
package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio25 {
	public static void main (String[] args) {
		Scanner uwu = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo a nossa frutaria! A unidade da fruta possui 1 kg"); 
		
		int qntMaca;
		System.out.println("digite a quantidade de maças compradas: "); 
		qntMaca = uwu.nextInt(); 
		
		int qntMorango; 
		System.out.println("digite a quantidade de morangos compradas: ");
		qntMorango = uwu.nextInt();
		
		double kg1 = qntMaca;
		double kg2 = qntMorango; 
		
		double kgMaca1 = 2.50; 
		double kgMaca2 = 2.20; 
		double kgMorango1 = 1.80; 
		double kgMorango2 = 1.50; 
		
		// se o kg de maça e morango forem menores do que 5 
		if(kg1 <= 5 && kg2 <= 5) {
			double precoFinalMaca = qntMaca * kgMaca1; 
			double precoFinalMorango = qntMorango * kgMorango1;
			double valorTotal = precoFinalMaca + precoFinalMorango;
			System.out.println("o valor total da compra é: " + valorTotal);
			// se o kg da maça e do morango forem maiores do que 5
		} else if (kg1 > 5 && kg2 > 5) {
			double precoFinalMaca1 = qntMaca * kgMaca2;
			double precoFinalMorango1 = qntMorango * kgMorango2;
			double valorTotal1 = precoFinalMaca1 + precoFinalMorango1;
			double quantidadeKilo = kg1 + kg2; 
			
			// agora vamos conferir se o cliente possui desconto 
				if(quantidadeKilo > 8 || valorTotal1 > 25) {
					double novoValor = (valorTotal1 - (valorTotal1 * 0.10));
					System.out.println("Você possui um desconto de 10%! O valor a ser pago é: " + novoValor); 
				} else {
				System.out.println("o valor total da compra é: " + valorTotal1);
				}
				// se o kg da maça for menor que 5 e do morango for maior 
		} else if (kg1 <= 5 && kg2 > 5) {
			double precoFinalMaca2 = qntMaca * kgMaca1;
			double precoFinalMorango2 = qntMorango * kgMorango2;
			double valorTotal2 = precoFinalMaca2 + precoFinalMorango2;
			double quantidadeKilo1 = kg1 + kg2; 
			
			// agora vamos conferir se o cliente possui desconto 
				if(quantidadeKilo1 > 8 || valorTotal2 > 25) {
					double novoValor2 = (valorTotal2 - (valorTotal2 * 0.10));
					System.out.println("Você possui um desconto de 10%! O valor a ser pago é: " + novoValor2); 
				} else {
				System.out.println("o valor total da compra é: " + valorTotal2);
				}
				// se o kg da maça for maior que 5 e o do morango for menor 
		} else if (kg1 > 5 && kg2 <= 5) {
			double precoFinalMaca3 = qntMaca * kgMaca1;
			double precoFinalMorango3 = qntMorango * kgMorango2;
			double valorTotal3 = precoFinalMaca3 + precoFinalMorango3;
			double quantidadeKilo3 = kg1 + kg2; 
			
			// agora vamos conferir se o cliente possui desconto 
				if(quantidadeKilo3 > 8 || valorTotal3 > 25) {
					double novoValor3 = (valorTotal3 - (valorTotal3 * 0.10));
					System.out.println("Você possui um desconto de 10%! O valor a ser pago é: " + novoValor3); 
				} else {
				System.out.println("o valor total da compra é: " + valorTotal3);
				}
				
				// caso a quantidade seja inválida 
		} else {
			System.out.println("quantidade inválida");
		}
			
	}
}
