package stack;

import java.util.Scanner;

public class queue {
	int size=6;
	int front=-1;
	int rear=-1;
	int[] queue=new int[size];
	void insert(int data) {
			if(rear==size-1) {
				System.out.println("Overflow");
				return;
			}
			if(front==-1) {
				front=0;
			}
			queue[++rear]=data;
		}
		 void delete() {
			 if(front==-1 && rear==-1) {
				 System.out.println("Underflow");
				 return;
			 }
			 else if(front==rear) {
				 front=-1;
				 rear=-1;
				 return;
			 }
			 front++;
		 }
		 void display() {
			 for(int i=front; i<=rear; i++ ) {
				 System.out.println(queue[i]+",");
			 }
		 }
		 public static void main(String []args) {
			 queue q1=new queue();
			 Scanner sc=new Scanner(System.in);
			 int choice;
			 do {
			 System.out.println("1.Inserting \n 2.deleting \n 3.display \n 4.exit");
				 choice=sc.nextInt();
				 switch(choice) {
				 case 1:
					System.out.println("Inserting Elements in a queue ");
					q1.insert(sc.nextInt());
					break;
				 case 2:
					 q1.delete();
					 break;
				 case 3:
					 q1.display();
					 break;
				 case 4:
					 System.exit(0); 
				default:
					System.out.println("Invalid Choice");
				 }
			 }while(choice<=4);
			/* q1.insert(10);
			 q1.insert(20);
			 q1.insert(30);
			 q1.insert(40);
			 q1.insert(50);
			 q1.insert(60);
			 q1.delete();
			 q1.delete();
			 q1.insert(70);
			 q1.display();	*/		 
	}
}

