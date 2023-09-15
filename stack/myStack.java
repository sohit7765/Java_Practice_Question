package stack;

public class myStack {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node top=null;
	void push(int data) {
		Node n=new Node(data);
		if(top==null)
		{
			top=n;
		}
		else {
			n.next=top;
			top=n;
		}
	}
	void pop() {
		if(top==null) {
			System.out.println("Stack is Empty");
		}
		else {
		top=top.next;
		}
	}
	void display() {
		Node current=top;
			if(current !=null) {
				System.out.print(current.data+",");
				current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		myStack s1=new myStack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.pop();
		s1.push(50);
		s1.pop();
		s1.push(60);
		s1.pop();
		s1.display();
	}
}
