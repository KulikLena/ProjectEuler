//Problem3
public class Largestprimefactor {
	static long n;


	static void IsFactor(long b) {
		n = b;

		
		boolean isprime = false;

		for (long k = 2; k < n; k++) {
			isprime = true;
			for (long s = 2; s < k; s++) {
				if (k % s == 0)
					isprime = false;

			}

			if (isprime) {

				if (n % k == 0) {
					System.out.println(k);
					n = n / k;
					
				}
				

			}
			
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		
		IsFactor(600851475143L);

	}
}
