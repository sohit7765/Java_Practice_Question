package collections_questions;
import java.util.*;
public class q4 {

	public static void main(String[] args) {
		System.out.println("Number duplicates character are present in the given......");
		int count=0;
		String s1="hellosohitkumar";
		for(int i=0; i<s1.length()-1; i++) {
			for(int j=i+1; j<s1.length(); j++) {
				char [] ch=s1.toCharArray();
				if((ch[i]==ch[j]) && (i!=j)) {
					count++;
					//System.out.print(ch[j] +);
				}
			}
		}
		System.out.println(count);

	}

}
