package Prova;

import java.util.Scanner;

public class StartApp02 {

	static Ponto02 ponto = new Ponto02();
	static Retangulo02 ret = new Retangulo02();
	static Scanner reading = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite o ponto inicial de X:");
		    ret.inicio.x = reading.nextInt();
		    
		System.out.println("Digite o ponto inicial de Y:");
		    ret.inicio.y = reading.nextInt();
		
		System.out.println("Digite o ponto final de X:");
		    ret.fim.x = reading.nextInt();
		    
		System.out.println("Digite o ponto final de Y:");
		    ret.fim.y = reading.nextInt();
		
		    estaDentro();
		
		reading.close();

	}
	public static void estaDentro() {
		
		System.out.println("Digite o ponto X:");
	        ponto.x = reading.nextInt();
	    
	    System.out.println("Digite o ponto Y:");
	        ponto.y = reading.nextInt();
	        
	        if (ponto.x >= ret.inicio.x && ponto.x <= ret.fim.x) {
	        	System.out.println("Ponto X esta dentro!!!");
	        	
	        } else {
	        	System.out.println("Ponto X esta fora!!!");
	        	
	        }
	        if (ponto.y >= ret.inicio.y && ponto.y <= ret.fim.y) {
	        	System.out.println("Ponto Y esta dentro!!!");
	        	
	        } else {
	        	System.out.println("Ponto Y esta fora!!!");
	        	
	        }
	}

}
