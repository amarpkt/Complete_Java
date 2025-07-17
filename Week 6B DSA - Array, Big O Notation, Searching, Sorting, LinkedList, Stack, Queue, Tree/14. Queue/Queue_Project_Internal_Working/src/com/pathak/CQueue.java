package com.pathak;

public class CQueue {
	int arr[] = new int[4];
	int size = 0;
	int front = 0;
	int rear = -1;
	public void enqueue(int data) {

		if(!isFull()) {
			rear = (rear+1)%arr.length;
			arr[rear] = data;
			size++;
		}else {
			System.out.println("Queue is full");
		}
	}

	public int dequeue() {
		if (!isEmpty()) {
			int data = arr[front];
			front = (front + 1) % arr.length;
			size--;
			return data;
		} else {
			System.out.println("Queue is empty");
			return -1;
		}
	}

	public void show() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.print("Queue elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[(front + i) % arr.length] + " ");
		}
		System.out.println();
	}


	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==4;
	}

}
