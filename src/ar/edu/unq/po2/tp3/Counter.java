package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> num = new ArrayList<Integer>();

    public ArrayList<Integer> getNum() {
		return num;
	}

	public void addNumber(int number) {
    	num.add(number);
    }
    
    public int cantPares() {
    	int pares = 0;
    	for(int numero:num) {
    		if(esPar(numero)) {
    			pares += 1;
    		}
    	}
    	return pares;
    }
    
    public int cantImpares() {
    	int impares = 0;
    	 for (int numero:num) {
    		 if(!esPar(numero)) {
    			 impares += 1;
    		 }
    	 }
    	 
    	return impares;
    }

   public int cantMultiplos(int numero2) {
	   int multiplos = 0;
	   for(int numero:num) {
		   if(esMultiplo(numero,numero2)){
			   multiplos += 1;
		   }
	   }
	   return multiplos;
   }
   
public  boolean esMultiplo(int n1,int n2){
	if (n1%n2==0)
		return true;
	else
		return false;
}


public  boolean esPar(int numero) {
    if (numero % 2 == 0) {
        return true;
    } else {
        return false;
    }
}
}

