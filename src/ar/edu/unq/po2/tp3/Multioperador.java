package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Multioperador {
   private ArrayList<Integer> nums = new ArrayList<Integer>();
   
   public void addNum(int num) {
	   nums.add(num);
   }
   
   public int sumarNums() {
	   int suma = 0;
	   for(int numero:nums) {
		   suma += numero;
	   }
	   return suma;
   }
   
   public int restarNums() {
	   int resta = 0;
	   for(int numero:nums) {
		   resta -= numero;
	   }
	   return resta;
   }
   
   public int multiplicarNums() {
	   int multi = 1;
	   for(int numero:nums) {
		   multi *= numero;
	   }
	   return multi;
   }
}
