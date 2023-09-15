package collection_question;
import java.util.*;
public class q1c {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(5);
		a2.add(6);
		a2.add(7);
		a2.add(8);
		System.out.println(a2);
		ArrayList<Integer> a3=new ArrayList<>();
		a3.addAll(al);
		a3.addAll(a2);
		System.out.println(a3);

	}

}
