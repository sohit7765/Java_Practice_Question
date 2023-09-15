package String_questions;

public class q9 {

	public static void main(String[] args) {
		String [] s1= {"Mohan","Sohit","Sunny","ranbir","Abhishek"};
		String item="Sohit";
		LinearSearch(s1,item);
		}

	private static void LinearSearch(String[] s1, String item) {
		for(int i=0; i<s1.length; i++) {
			if(s1[i]==item) {
				System.out.println(item+" is present at "+i+" index position");
			}
		}
		
	}

	}
