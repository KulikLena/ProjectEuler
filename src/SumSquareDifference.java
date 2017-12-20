//problem 6 
public class SumSquareDifference {
	static int sum1;
	static int sum2=0;
 public static int sumsquare1 (int a) {
	 for (int i=1; i<=a; i++) {
		 sum1+=(i*i);
		
	 }
	return sum1;
 }
 public static int sumsquare2 (int b) {
	 for (int i=1; i<=b; i++) {
		 sum2+=i;
		
	 }
	 return sum2*sum2;
 }
	
	public static void main(String[] args) {
		int x= sumsquare1(100);
		int y = sumsquare2(100);
		System.out.println(x);
		System.out.println(y);
		System.out.println(y-x);
		

	}

}
