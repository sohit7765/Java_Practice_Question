package stack;
import java.util.*;
public class Stack {
	int n=10;
	int top=-1;
	int [] stack=new int[n];
	void push(int data) {
		if(top==n-1) {
			System.out.println("OverFlow condition");
		}
		else {
			stack[++top]=data;
		}
	}
	void pop() {
		if(top==-1) {
			System.out.println("UnderFlow Condition");
		}
		else {
			top--;
		}
	}
	int peek() {
		if(top==-1) {
			System.out.println("Stack is Empty");
			return 0;
		}
		return stack[top];
	}
	boolean isEmpty(){
		return (top==-1);
	}
	void display() {
		for(int i=top; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}
	public static void main(String[] args) {
		Stack s1=new Stack();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("1.push \n 2.pop \n 3.peek \n 4.display \n 5.exit ");
		System.out.println("Enter your Choice");
		 choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Elements in The Stack");
			s1.push(sc.nextInt());
			break;
		case 2:
			s1.pop();
			break;
		case 3:
			s1.peek();
			break;
		case 4:
			s1.display();
			break;
		case 5:
			System.exit(0);
			default:
				System.out.println("Invalid Option");
		}
	}
	while(choice <=5);
	}
}
	/*	s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.pop();
		s1.pop();
		s1.pop();
		s1.push(60);
		s1.display();
		System.out.println(s1.isEmpty());
		System.out.println(s1.peek());*/

