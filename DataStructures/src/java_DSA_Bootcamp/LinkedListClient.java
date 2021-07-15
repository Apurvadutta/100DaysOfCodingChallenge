package java_DSA_Bootcamp;

public class LinkedListClient {

	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.insertAtFirst(2);
		list.insertAtFirst(5);
		//list.display();
		list.insertAtLast(6);
		list.insertAtFirst(9);
		list.insertAtLast(4);
		//list.display();
		System.out.println("Mid: " + list.mid());
		list.deleteAtLast();
		//list.display();
		list.deleteAtFirst();
		list.display();
		//System.out.println("Mid: " + list.mid());
		System.out.println(list.cycleDetection());
	}
}
