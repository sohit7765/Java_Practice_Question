import java.util.*;
public class q26 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
