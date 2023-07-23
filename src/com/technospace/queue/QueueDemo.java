package com.technospace.queue;

import java.util.Scanner;

public class QueueDemo {
	int queue[] = new int[5];
	int front = -1;
	int rear = -1;
	int no;
	Scanner scanner = new Scanner(System.in);
	public void enqueue(){
		System.out.println("Before Enqueue \n Front ="+ front+"\t Rear = "+rear);
		if(front == -1){
			front = rear = 0;
			System.out.println("Enter the number to add in queue");
			no = scanner.nextInt();
			queue[rear] = no;
		}else if (rear == queue.length-1) {
			System.out.println("Queue is full");
		} else {
			rear++;
			System.out.println("Enter the Number to Add in Queue:");
			no = scanner.nextInt();
			queue[rear] = no;

		}
		System.out.println("AFTER ENQUEUE  \n Front="+front+"\t Rear="+rear);
	}
	public void dequeue() {
		if(front == -1 || front == queue.length){
			System.out.println("Queue is Empty");
		}else {
			System.out.println("Element Deleted "+queue[front]);
			front++;
		}
			
		}
	public void display(){
		for(int i= front;i<=rear;i++){
		System.out.println(queue[i]);	
		}
	}
		
	public static void main(String[] args) {
		QueueDemo queueDemo = new QueueDemo();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do{
		System.out.println("### QUEUE OPERATIONS ###");
		System.out.println("\n1. ENQUEUE \n2. DEQUEUE \n3. DISPLAY \n4. EXIT");
		System.out.println("Enter the Operation Number:");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
				queueDemo.enqueue();
			break;
		case 2:
				queueDemo.dequeue();
			break;
		case 3:
				queueDemo.display();
			break;
				
		default:
				System.out.println("Invalid Operations");
			break;
		}
	}while(choice!=4);
	}
}
