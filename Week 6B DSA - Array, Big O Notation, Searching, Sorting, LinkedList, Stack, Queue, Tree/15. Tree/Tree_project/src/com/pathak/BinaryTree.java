package com.pathak;

public class BinaryTree {
	Node root;

	public void insert(int data) {
		root = insertRec(root, data);
	}

	public Node insertRec(Node root, int data) {
		if(root==null)
			root = new Node(data);
		else if(data < root.data)
			root.left = insertRec(root.left, data);
		else
			root.right = insertRec(root.right, data);
		return root;
	}

	
	public void inOrder() {
		
	}
	
	public void inOrderRec() {
		
	}
	
}

class Node{
	int data;
	Node left;
	Node right;

	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}