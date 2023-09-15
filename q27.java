package function_questions;
import java.util.*;
public class q27 {
	static void printPrimeFactors(int n)
		{
			if(n <= 1)
				return;

			for(int i=2; i*i<=n; i++)
			{
				while(n % i == 0)
				{
					System.out.print(i+" ");

					n = n / i;
				}
			}

		//	if(n > 1)
		//		System.out.print(n+" ");

		//	System.out.println();
		}

		public static void main (String[] args) {
			
			int n = 450;

			printPrimeFactors(n);

		}
	}


