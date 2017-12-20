//Problem2

public class EvenFibonaccinumbers {

	static int sum = 0;
	static int num;

	public static int fibonacci(int num) {
		if (num == 1 || num == 2)
			return 1;
		else
			return (fibonacci(num - 1) + fibonacci(num - 2));
	}

	public static void main(String[] args) {
		num=4000000;

		for (int i = 1; fibonacci(i) <= num; i++) {
			if (fibonacci(i) % 2 == 0)
				sum += fibonacci(i);

		}
		System.out.println(sum);
	}

}
