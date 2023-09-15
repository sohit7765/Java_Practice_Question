package function_questions;

/*public class q1 {
	public static void display() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		display();
	}
}*/
public class q1{
    public static void sort012(int a[], int n)
    {
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=a[i];
                }
            }
        }
    }
    public static void display(int a[],int n) {
    	for(int i=0; i<n; i++) {
    		System.out.println(a[i]);
    	}
    }
    public static void main(String[] args){
        int [] a= {3,4,2,11,56};
        int n=a.length;
        sort012(a,n);
        display(a,n);
    }
}

