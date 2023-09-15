package collection_question;
import java.util.*;
public class q1g {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("red");
		al.add("black");
		al.add("blue");
		al.add("white");
		al.add("purple");
		System.out.println(al);
		if(al.contains("orange")) {
			System.out.println("Elements is presents in the ArrayList");
		}
		else {
			System.out.println("Elemets is not presents in the ArrayList");
		}

	}

}
