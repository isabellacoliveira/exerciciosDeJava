package linguagemDeProgamacao;

import java.util.Scanner;

public class LpExercicio20 {
	public static void main(String [] args) {
		Scanner uwu = new Scanner(System.in);
		
		 String time1;
		 System.out.println("digite o nome do time 1: ");
		 time1 = uwu.nextLine(); 
		 
	     String time2; 
	     System.out.println("digite o nome do time 2: ");
		 time2 = uwu.nextLine(); 
		 
		 int gol1;
		 System.out.println("digite quantos gols fez o time 1:  ");
		 gol1 = uwu.nextInt(); 
		 
	     int gol2; 
	     System.out.println("digite quantos gols fez o time 2: ");
		 gol2 = uwu.nextInt(); 

		 if(gol1 > gol2) {
			 System.out.println("o " + time1 + "é campeão"); 
		} else if (gol1 < gol2) {
			System.out.println("o " +  time2 + "é campeão"); 
		} else {
			System.out.println("empate"); 
		}

 }
}

