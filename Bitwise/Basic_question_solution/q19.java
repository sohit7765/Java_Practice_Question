
public class q19 {

	public static void main(String[] args) {
		int [] a= {1,-2,3,-4,-5,-11,6,7,12,-14,25,66};
		int k=4;
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		if(i==k-1) {
			System.out.println("k smallest elements is "+a[i]);
		}
		}
	}

}
