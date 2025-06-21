package com.pathak;

public class Queue {
	
	int size = 0;
	int front = 0;
	int rear = -1;
	int arr[] = new int[4];
	
	public void enqueue(int data) {
		rear++;
		arr[rear] = data;
		size++;
	}
	
	public int dequeue() {
		int data = arr[front];
		front++;
		return data;
		
	}
	
	public void show() {
		for(int i=front; i <size ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

}
