package collection_question;
import java.util.*;
public class q1b {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println("Before Swaping...");
		System.out.println(al);
		Collections.swap(al,1,3);
		System.out.println("After Swaping....");
		System.out.println(al);

	}

}
