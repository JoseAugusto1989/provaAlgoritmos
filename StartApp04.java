package Prova;

import java.util.Scanner;

public class StartApp04 {

	static Scanner reading = new Scanner(System.in);
	static Retangulo04 ret = new Retangulo04();
	
	public static void main(String[] args) {
	
		lerRetangulo();

		
		reading.close();
	}
	public static Retangulo04 lerRetangulo() {
		
		System.out.println("Digite o X inicial:");
		    ret.xIni = reading.nextInt();
		    
	    System.out.println("Digite o X final:");
		    ret.xFim = reading.nextInt();
		    
		System.out.println("Digite o Y inicial:");
		    ret.yIni = reading.nextInt();
		    
	    System.out.println("Digite o Y final:");
		    ret.yFim = reading.nextInt();
		    
		    System.out.println("X inicial" + ret.xIni + "X final " + ret.xFim);
		    System.out.println("Y inicial" + ret.yIni + "Y final " + ret.yFim);
		    
		    return ret;
		
	}

}
