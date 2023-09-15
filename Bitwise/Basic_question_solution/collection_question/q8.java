package collection_question;
import java.util.*;
public class q8 {

	public static void main(String[] args) {
		TreeSet<String> t1=new TreeSet<>();
		t1.add("red");
		t1.add("blue");
		t1.add("pink");
		t1.add("black");
		t1.add("purple");
		System.out.println(t1);
		t1.remove("pink");
		System.out.println(t1);

	}

}
