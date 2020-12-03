package Prova;

public class StartApp01 {

	static Data01 data = new Data01();
	static Periodo01 periodo = new Periodo01();
	
	public static void main(String[] args) {
		
            periodo.inicio.dia = 01;
            periodo.inicio.mes = 01;
            periodo.inicio.ano = 2020;
            
	        periodo.fim.dia = 10;
	        periodo.fim.mes = 12;
	        periodo.fim.ano = 2020;
	        
	        estaDentro();
	     
	}
	public static void estaDentro() {
		
		    data.dia = 24;
		    data.mes = 06;
		    data.ano = 2020;
		
		    if (data.dia >= periodo.inicio.dia && data.dia <= periodo.fim.dia && data.mes >= periodo.inicio.mes && data.mes >= periodo.fim.mes
		    		&& data.ano >= periodo.inicio.ano && data.ano <= periodo.fim.ano) {
		    	System.out.println("A data esta correta");
		    	
		    } else {
		    	
		    	System.out.println("A data não esta correta!!!");
		    }
	}

}
