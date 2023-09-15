
public class q23 {

	public static void main(String[] args) {
		int [] arr= {12,3,4,1,6,9};
		int sum=24;
		for(int i=0;i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for(int k=j+1; k<arr.length; k++){
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.print("Triplet Number "+ arr[i]);
					}
				}
			}
		}

	}

}
