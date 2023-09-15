import java.util.LinkedList;
public class q27 {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(1, 100);
		l1.remove(2);
		for(int l2:l1) {
			System.out.println(l2);
		}

	}

}
