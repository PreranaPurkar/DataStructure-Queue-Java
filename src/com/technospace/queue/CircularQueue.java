package com.technospace.queue;

import java.util.Scanner;

public class CircularQueue {
	int queue[] = new int[5];
	int front = -1;
	int rear = -1;
	int no;
	Scanner sc = new Scanner(System.in);
	//Enqueue function is used for insert the element in queue 
	public void enqueue(){
		System.out.println("Before Enqueue \n Front"+front+"\t Rear"+rear);
		if(front == -1){
			front = rear = 0;
			System.out.println("Enter the number to add in queue");
			no = sc.nextInt();
			queue[rear] = no;
		}else if (rear == queue.length-1) {
			System.out.println("Queue is full");
		} else {
			rear++;
			System.out.println("Enter the Number to Add in Queue:");
			no = sc.nextInt();
			queue[rear] = no;

		}
		System.out.println("AFTER ENQUEUE  \n Front="+front+"\t Rear="+rear);
	}
		// Dequeue function is used for deleting element from queue
	public void dequeue(){
		if(front == -1 || front == queue.length){
			System.out.println("Queue is Empty");
		}else {
			System.out.println("Element Deleted "+queue[front]);
			front++;
			System.out.println("AFTER DEQUEUE  \n Front="+front+"\t Rear="+rear);
			if(front == queue.length){
				front = rear = -1;
			}
		}
	}
		//Display function is used for display the element of queue		
	public void display(){
		for(int i= front;i<=rear;i++){
			System.out.println(queue[i]);	
			}
	}
	public static void main(String[] args) {
		CircularQueue circularQueue = new CircularQueue();
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
		System.out.println("### QUEUE OPERATIONS ###");
		System.out.println("\n1. ENQUEUE \n2. DEQUEUE \n3. DISPLAY \n4. EXIT");
		System.out.println("Enter the Operation Number:");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
				circularQueue.enqueue();
			break;
		case 2:
				circularQueue.dequeue();
			break;
		case 3:
				circularQueue.display();
			break;
				
		default:
				System.out.println("Invalid Operations");
			break;
		}
	}while(choice!=4);
	}
	}


