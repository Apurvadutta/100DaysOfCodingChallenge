package java_DSA_Bootcamp;

public class DynamicQueue extends CircularQueue {
	
	public void add(int item) {
		if(isFull()) {
			 int[] temp = new int[data.length*2];
			 for(int i = 0; i<size; i++) {
				 temp[i] = data[(front+i)%data.length];
			 }
			 this.data = temp;
		}
		super.add(item);
	}
}
