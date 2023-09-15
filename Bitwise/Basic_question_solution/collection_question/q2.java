package collection_question;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(9);
		al.add(24);
		al.add(34);
		System.out.println(al);
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(2);
		a2.add(5);
		a2.add(9);
		a2.add(24);
		a2.add(34);
		System.out.println(a2);
		System.out.println(al.equals(a2));
	}

}
