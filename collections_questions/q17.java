package collections_questions;
import java.util.*;
public class q17 {

	public static void main(String[] args) {
	/*	ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for(int i: al) {
			System.out.println(i+" ");
		}*/
		
		Stack<Integer> s1=new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		for(int i: s1) {
			System.out.println(i+" ");
		}
		System.out.println(s1.pop());
		System.out.println(s1.peek());
	}

}
