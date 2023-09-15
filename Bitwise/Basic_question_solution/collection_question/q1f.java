package collection_question;
import java.util.*;
public class q1f {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<>();
		al.add(21.12);
		al.add(31.42);
		al.add(25.06);
		al.add(26.77);
		al.add(21.0);
		System.out.println(al);
		System.out.println(al.removeAll(al));
		System.out.println(al);

	}

}
