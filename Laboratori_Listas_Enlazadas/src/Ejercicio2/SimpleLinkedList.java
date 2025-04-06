package Ejercicio2;

import PrincipalPackage.SingleLinkedList;

public class SimpleLinkedList extends SingleLinkedList<Persona> {

	public void printList() {

		Node<Persona> temp = head;
		while (temp != null) {
			if (temp.data instanceof Persona) {
				Persona person = (Persona) temp.data;
				String type = person.esIdPar() ? "Par" : "Impar";
				System.out.println(person + " ID: " + type);

			} else {
				System.out.print(temp.data + " ");
			}

			temp = temp.next;
		}
		System.out.println();
	}

}
