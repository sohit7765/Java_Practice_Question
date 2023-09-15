package collection_question;
import java.util.*;
public class q1d {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		System.out.println("After reversing the ArrayList....");
		Collections.reverse(al);
		System.out.println(al);

	}

}
