package collections_questions;
import java.util.HashMap;
import java.util.Map;
public class q1 {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		hm.put("Mohit kumar", 30);
		hm.put("rohit kumar", 24);
		hm.put("sohit kumar", 21);
		hm.put("rohan kumar", 21);
		hm.put("Abhishek kumar", 19);
		//System.out.println(hm);
		for(Map.Entry<String,Integer> hm2 : hm.entrySet()) {
			System.out.println("Name :"+ hm2.getKey() +"  Age:"+ hm2.getValue());
		}

	}

}
