import java.util.Arrays;

public class Summationofprimes {

	static int x = 0;
	static int sum = 0;
	static boolean[] primes;

	public Summationofprimes(int n) {
		 primes = new boolean[n + 1];
	}

	public void fillSieve() {

		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;
		for (int i = 2; i < primes.length; ++i) {
			if (primes[i]) {
				for (int j = 2; i * j < primes.length; ++j) {
					primes[i * j] = false;
				}
			}
			if (primes[i]) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Summationofprimes pr = new Summationofprimes(2000000);
		pr.fillSieve();
	}

}
