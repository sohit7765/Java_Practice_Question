package collection_question;
import java.util.*;
public class q5 {

	public static void main(String[] args) {
		List l1=new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println(l1);
		List<Integer> l2=new ArrayList<>(l1);
		System.out.println(l2);

	}

}
