package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicio11 {
	public static void main (String[] args) {
		Scanner uwu = new Scanner(System.in); 
		
		int a; // 5
		System.out.println("Digite o primeiro número");
		a = uwu.nextInt();
		
		int b; // 7
		System.out.println("Digite o segundo número");
		b = uwu.nextInt();
		
		int c; // 6
		System.out.println("Digite o terceiro número");
		c = uwu.nextInt();
		
		if (a < b) {
			if(a < c) {
				if(b < c) {
					System.out.println(a + "\n" + b + "\n" + c); 
				} else {
					System.out.println(a + "\n" + c + "\n" + b); 
				}
			} else if (c < b){
				System.out.println(c + "\n" + a + "\n" + b); 
			} else {
				System.out.println(b + "\n" + c + "\n" + a);
			}
		} else if (b < c) {
			if(a < c) {
				System.out.println(b + "\n" + c + "\n" + a);
			} else {
				System.out.println(c + "\n" + b + "\n" + a); 
			}
		}
	}
}
