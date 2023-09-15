import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=sc.nextLine();
		int vowels=0, consonants=0, whitespace=0;
		s1=s1.toLowerCase();
		for(int i=0; i<s1.length(); i++) {
			char ch=s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels++;
			}
			else if(ch==' ') {
				whitespace++;
			}
			else {
				consonants++;
			}
			
		}
		System.out.println("vowels = "+vowels+ "\n" +"consonants =" +consonants+ "\n" +"whitespace =" + whitespace);

	}

}

