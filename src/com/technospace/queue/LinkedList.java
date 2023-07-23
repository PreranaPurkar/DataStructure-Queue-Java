package com.technospace.queue;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		next = null;
	}
}
public class LinkedList {
	Node head = null;
	Node tail = null;
	
	public void insert(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void display() {
		Node currentNode = head;
		if(head == null) {
			System.out.println("Linked List is Empty");
		}
		while(currentNode != null) {
			System.out.print(currentNode.data+"--->");
			currentNode = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(10);
		linkedList .insert(20);
		linkedList.insert(30);
		linkedList.insert(40);
		linkedList.display();
	}

}
