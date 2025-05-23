

	

package Ejercicio1;

import PrincipalPackage.SingleLinkedList;

public class SimpleLinkedList extends SingleLinkedList<Integer> {
    
    public SimpleLinkedList countImparPosition() {
    	SimpleLinkedList imparPosition = new SimpleLinkedList();
        SingleLinkedList<Integer>.Node<Integer> temp = head;  // <-- Referencia correcta a Node
        int counter = 1;
        
        while (temp != null) {
            if (counter % 2 == 0) {
                imparPosition.insertAtEnd(temp.data);
            }
            temp = temp.next;
            counter++;
        }
        
        return imparPosition;
    }
}

