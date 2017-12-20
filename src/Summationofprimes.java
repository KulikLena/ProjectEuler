
public class Summationofprimes {

	static int n;
	static int x = 0;
	static int sum = 0;

	static void IsPrime(int b) {
		n = b;

		boolean isprime = false;
		

		for (int i = 2; i <= n; i++) {
			isprime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					isprime = false;

			}

			if (isprime) {
				System.out.println(i);
				sum += i;

			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrime(10);
	}

}
