package Ejercicio3;

import PrincipalPackage.SingleLinkedList;



public class SimpleList extends SingleLinkedList<Integer> {
	
	public void deleteParNumber() {
		
		
		if(head==null) {
			return;
		}
		
		// Si el primer nodo (head) es par
		while(head != null &&(Integer) head.data%2==0) {
			head=head.next;
			
		}
		
		// Eliminar nodos pares en la lista
		Node<Integer> temp = head;
		while(temp != null && temp.next != null) {
			if(temp.next.data%2==0) {
				temp.next=temp.next.next; //Se salta el nodo par
			}else {
				temp=temp.next; // avanza solo si no se elimina
			}
		}
	}
	


}
