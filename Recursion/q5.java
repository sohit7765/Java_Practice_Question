
public class q5 {

	public static void main(String[] args) {
		String s1="SOHIT";
		printRev(s1,s1.length()-1);

	}

	private static void printRev(String s1, int i) {
		if(i==0) {
			System.out.println(s1.charAt(i));
			return;
		}
		System.out.print(s1.charAt(i));
		printRev(s1,i-1);
		
	}

}
