package function_questions;
import java.util.*;
public class q1a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(Maximum(a,b,c));
		System.out.println(Minimum(a,b,c));
	}

	private static int Maximum(int a, int b, int c) {
		if(a>b & a>c){
			return a;
		}
		else if(a<b & b>c){
			return b;
		}
		else {
			return c;
		}	
	}
	private static int Minimum(int a, int b, int c) {
		if(a>b & b>c) {
			return c;
		}
		else if(b>a & c>b) {
			return a;
		}
		else {
			return b;
		}
	}
			}


