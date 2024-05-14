package com.learning.queue;

public class Running {

	public static void main(String[] args) {

		Queue q = new Queue();
		
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(6);
		q.enQueue(9);
		
		q.deQueue();
		
		
		q.show();
	}

}
