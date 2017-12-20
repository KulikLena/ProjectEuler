import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestPalindromePproduct {

	private static boolean isPalindrome(String src) {

		boolean result = true;
		for (int i = 0; i < src.length() / 2; i++) {
			if (src.charAt(i) != src.charAt(src.length() - i - 1)) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Integer product = 1;

		ArrayList<Integer> product1 = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				product = i * j;

				String s = product.toString();
				if (isPalindrome(s)) {
					product1.add(product);
				}
			}
		}
		Collections.sort(product1);

		System.out.println(product1);
	}

}

