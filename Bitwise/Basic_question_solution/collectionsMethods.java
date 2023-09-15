import java.util.*;
public class collectionsMethods {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Collections.swap(al, 1, 3);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		for(int a1:al) {
			System.out.println(a1);
		}
	}

}
