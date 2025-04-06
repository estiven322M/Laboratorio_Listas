package Ejercicio6;

import java.util.Random;



public class Main {
	
	public static void main(String[] args) {
		DoublyList6 list = new DoublyList6();
		
		Random rand = new Random();
		
		for(int i =0; i<20; i++) {
			int element =rand.nextInt(101);
			list.insertAtEnd(element);
		}
		
		list.printList();
		list.reversePrint();
	}
	
	
	
	

}
