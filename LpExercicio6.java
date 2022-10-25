package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio6 {
	public static void main(String [] args) {
		
		Scanner uwu = new Scanner(System.in); 
		
		int n1;
		System.out.println("digite o primeiro número"); 
		n1 = uwu.nextInt(); 
		
		int n2;
		System.out.println("digite o segundo número"); 
		n2 = uwu.nextInt(); 

if (n1 > n2) { 
    int diferenca = n1 - n2; 
System.out.println(diferenca); 
} else if (n2 > n1) { 
    int diferenca2 = n2 - n1; 
System.out.println(diferenca2);
} else if (n1 == n2) { 
System.out.println("Não vamos fazer a diferença pois os números não são diferentes"); 
	} else { 
System.out.println("número inválido");
 }
}
}

