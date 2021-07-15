package java_DSA_Bootcamp;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClient {

	public static void main(String[] args) {
		DynamicQueue queue = new DynamicQueue();
		for(int i = 1; i<10000;i++) {
			queue.add(i);
		}
//		queue.add(3);
//		queue.add(8);
//		queue.add(6);
//		queue.add(5);
		System.out.println(queue.remove());
	}

}
