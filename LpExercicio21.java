package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio21 {
	public static void main (String [] args) {
		Scanner uwu = new Scanner(System.in); 
		
		double nota1; 
		System.out.println("digite a nota 1: "); 
		nota1 = uwu.nextDouble();
		
		double nota2; 
		System.out.println("digite a nota 2: "); 
		nota2 = uwu.nextDouble();
		
		double nota3; 
		System.out.println("digite a nota 3: "); 
		nota3 = uwu.nextDouble();
		
		double mediaExercicios; 
		System.out.println("digite a media dos exercicios: "); 
		mediaExercicios = uwu.nextDouble();
		
		double mediaAproveitamento = (nota1 + nota2 + nota3 + mediaExercicios) / 7; 
		
		if(mediaAproveitamento >= 9) {
			System.out.println("o aluno tirou A"); 
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
			System.out.println("o aluno tirou B"); 
		} else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			System.out.println("o aluno tirou C"); 
		} else if(mediaAproveitamento < 6) {
			System.out.println("o aluno tirou D"); 
		} else {
			System.out.println("nota inválida"); 
		}
	}
}
