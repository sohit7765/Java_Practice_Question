package String_questions;

public class q8 {

	public static void main(String[] args) {
		String s1="abc";
		for(int i=0; i<=s1.length(); i++) {
			for(int j=i+1; j<=s1.length(); j++) {
				System.out.print(s1.substring(i,j)+",");
			}
		}

	}

}
