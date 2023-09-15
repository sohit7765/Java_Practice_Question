package collection_question;
import java.util.*;
public class q1a {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
		System.out.println("After copy to Another Array.....");
		ArrayList<Integer> a2=new ArrayList<>();
		a2.addAll(al);
		System.out.println(a2);

	}

}
