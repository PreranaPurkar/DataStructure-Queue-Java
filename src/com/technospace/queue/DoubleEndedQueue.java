package com.technospace.queue;

import java.util.Scanner;

public class DoubleEndedQueue {
	int queue[] = new int[5];
	int front = -1;
	int rear = -1;
	Scanner scanner = new Scanner(System.in);
	// Finsert function is used for insert number of front side insertion
	public void finsert(){
		if(front == -1 && rear == -1){
			front = rear = 0;
			System.out.println("Enter the number to add in queue");
			int no = scanner.nextInt();
			queue[front]=no;
		}else if((front == 0 && rear == queue.length-1)||(front == rear)){
			System.out.println("Queue is Full or Front is not allowed.");
		}else {
			front --;
			System.out.println("Enter the number to add in queue");
			int no = scanner.nextInt();
			queue[front]=no;
		}
	}
	
	//rinsert function is used for insert number of rear side in queue
	public void rinsert(){
		if(front == -1 && rear == -1){
			front = rear = 0;
			System.out.println("Enter the number to add in queue");
			int no = scanner.nextInt();
			queue[front]=no;
		}else if (rear == queue.length-1) {
			System.out.println("Rear is reached at the end of the queue");
		}
		else{
			rear ++;
			System.out.println("Enter the number to add in queue");
			int no = scanner.nextInt();
			queue[rear]=no;
		}
	}
	//fdelete function is used for delete number of front side from queue
	public void fdelete(){
		if(front == -1 && rear == -1) {
			System.out.println("Queue is Empty, Can Not Delete Element");
		} else {
			System.out.println("Element Deleted:"+queue[front]);
			front++;
		}
	}
	// rdelete function is used for delete number of rear side from queue
	public void rdelete(){
		if(front == -1 && rear == -1) {
			System.out.println("Queue is Empty, Can Not Delete Element");
		} else {
			System.out.println("Element Deleted:"+queue[rear]);
			rear--;
		}
	}
	//display function is used for display the number of queue
	public void display(){
		for(int i = front;i <= rear;i++){
			System.out.println(" "+queue[i]);
		}
	}
	public static void main(String[] args) {
		DoubleEndedQueue doubleEndedQueue = new DoubleEndedQueue();
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do{
			
			System.out.println("*** DOUBLE ENDED QUEUE ***");
			System.out.println("\n1. INSERT FROM FRONT \n2. INSERT FROM REAR \n3. DELETE FROM FRONT \n4. DELETE FROM REAR \n5. DISPLAY \n6. EXIT");
			System.out.println("Enter the Operation:");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				doubleEndedQueue.finsert();
				break;
			case 2:
				doubleEndedQueue.rinsert();
				break;
			case 3:
				doubleEndedQueue.fdelete();
				break;
			case 4:
				doubleEndedQueue.rdelete();
				break;
			case 5:
				doubleEndedQueue.display();
				break;
			case 6:
				System.out.println("EXIT CODE");
				break;
			default:
				System.out.println("Invalid Operation");
				break;
			}
		}while(choice!=6);
	}
	
}

