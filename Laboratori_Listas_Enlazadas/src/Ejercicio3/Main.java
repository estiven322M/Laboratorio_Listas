package Ejercicio3;

import java.util.Random;



public class Main {
	
	public static void main(String[] args) {
		
		SimpleList list = new SimpleList();
		Random rand = new Random();
		
		for(int i =0; i<20; i++) {
			int element =rand.nextInt(101);
			list.insertAtEnd(element);
		}
		
		list.printList();
		list.deleteParNumber();
		list.printList();
		
	}

}
