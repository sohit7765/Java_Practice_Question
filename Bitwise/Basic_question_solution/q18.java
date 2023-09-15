
public class q18 {

	public static void main(String[] args) {
		int [] arr= {1,3,4,3,2,3,5};
		int count=0;
		int x=3;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		System.out.println(count);

	}

}
