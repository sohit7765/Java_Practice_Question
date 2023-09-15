package collection_question;
import java.util.*;
public class q4 {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println(l1);
		LinkedList<Integer> l2=new LinkedList<>();
		l2.add(4);
		l2.add(5);
		l2.add(6);
		System.out.println(l2);
		l2.addAll(l1);
		System.out.println(l2);
		

	}

}
