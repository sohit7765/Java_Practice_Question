import java.util.Scanner;
public class reverse_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of Array");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter the elements in the Array");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ ",");
		}

	}

}
