
public class SpecialPythagoreantriplet {
	static int a;
	static int b;
	static int c;

	public static void main(String[] args) {
		for (c = 1; c < 1000; c++) {
			for (a = 1; a < 1000; a++) {
				for (b = 1; b < 1000; b++) {
					int res = a * a + b * b;

					if (res == (c * c)&(a+b+c)==1000) {
						System.out.println(a +" "+ b + " "+c);
					System.out.println(a*b*c);
					}
				}
				
			}

		}

	}
}
