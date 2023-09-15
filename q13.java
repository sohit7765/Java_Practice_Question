package collections_questions;
import java.util.*;
public class q13 {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(4);
		l1.add(2);
		l1.add(5);
		l1.add(1);
		l1.add(4);
		System.out.println(l1+",");
		Set<Integer> s1=new HashSet<>();
		for(int no:l1) {
			if(s1.add(no)==false){
				System.out.println(no);
			}
		}

	}

}
