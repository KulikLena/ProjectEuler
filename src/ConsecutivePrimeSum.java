
public class ConsecutivePrimeSum {
	static int n;
	static int x = 0;
	static int sum = 0;
	

	static void IsPrime(int b) {
		n = b;

		boolean isprime = false;
		boolean isprime1 = false;

		for ( int i = 2; i <= n; i++) {
			isprime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					isprime = false;

			}
		
			if (isprime) {

				sum += i;

				for (int k = 2; k < sum; k++) {
					isprime1 = true;
					if (sum % k == 0)
						isprime1 = false;

				}

				if (isprime1 && (sum < n))
					System.out.println(sum);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrime(1000);
	}

}
