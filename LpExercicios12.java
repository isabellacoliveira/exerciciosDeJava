package linguagemDeProgamacao;

import java.util.Scanner; 

public class LpExercicios12 {
	public static void main(String[] args) {
		Scanner uwu = new Scanner(System.in);
		
	     int n1;
	     System.out.println("digite o primeiro número"); 
	     n1 = uwu.nextInt(); 
	     
	     int n2;
	     System.out.println("digite o segundo número"); 
	     n2 = uwu.nextInt(); 
	     
	     int n3;
	     System.out.println("digite o terceiro número"); 
	     n3 = uwu.nextInt(); 
	     
	     int n4;
	     System.out.println("digite o quarto número"); 
	     n4 = uwu.nextInt(); 
	    
	     	  if (n1 % 2 == 0 || n1 % 3 == 0) { 
	    	  System.out.println("o número é divisível: " + n1); 
	    	  } if (n2 % 2 == 0 || n2 % 3 == 0) { 
	    	  System.out.println("o número é divisível: " + n2); 
	    	  }  if (n3 % 2 == 0 || n3 % 3 == 0) { 
	    	  System.out.println("o número é divisível: " + n3); 
	    	  } if (n4 % 2 == 0 || n4 % 3 == 0) { 
	    	  System.out.println("o número é divisível: " + n4); 
	    	  }
	}
	
}



