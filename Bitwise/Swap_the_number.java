
public class Swap_the_number {

	public static void main(String[] args) {
		int a=25, b=12;
		System.out.println("Before Swaping");
		System.out.println(a+"\n"+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swaping");
		System.out.println(a+"\n"+b);

	}

}
