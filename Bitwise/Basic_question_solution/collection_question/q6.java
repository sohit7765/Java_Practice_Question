package collection_question;
import java.util.*;
public class q6 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("red");
		hs.add("orange");
		hs.add("black");
		hs.add("blue");
		hs.add("pink");
		System.out.println(hs);
		Set<String> s1=new TreeSet<>(hs);
		System.out.println(s1);
		

	}

}
