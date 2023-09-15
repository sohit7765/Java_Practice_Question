package collection_question;
import java.util.*;
public class q9 {

	public static void main(String[] args) {
		int count=0;
		Map<Integer,String> m1=new HashMap<>();
		m1.put(31,"Mohit kumar");
		m1.put(25,"Rohit kumar");
		m1.put(22,"Sohit kumar");
		m1.put(21, "rohan kumar");
		m1.put(19, "Abhishek kumar");
		for(int i=0; i<m1.size(); i++) {
			count++;
		}
		System.out.println(count);
		System.out.println(m1.keySet());
		System.out.println(m1.size());

	}

}
