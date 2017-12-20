
public class prime10001st {

	public static void main(String[] args) {
		boolean isprime = false;
		int count = 0;
		int i = 0;

		// TODO Auto-generated method stub

		for (i = 2;; i++) {

			isprime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					isprime = false;

			}

			if (isprime) {
				count++;
				if (count == 10002)
					break;
				System.out.println(i);

			}
			
		}
	}
}
