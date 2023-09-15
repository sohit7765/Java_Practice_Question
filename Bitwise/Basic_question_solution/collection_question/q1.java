package collection_question;
import java.util.*;
public class q1 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(12);
		al.add(15);
		al.add(3);
		al.add(21);
		al.add(1);
		al.add(56);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

	}

}
