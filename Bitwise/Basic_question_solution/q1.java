import java.util.*;
public class q1 {

	public static void main(String[] args) {
		String s1="Sohit";
		String s2="kumar";
		System.out.println(s1 +" "+ s2);
		int l1=s1.length();
		int l2=s2.length();
		s1=s1+s2;
		s2=s1.substring(0,l1);
		s1=s1.substring(l2);
		System.out.println(s1+" "+s2);

	}

}
