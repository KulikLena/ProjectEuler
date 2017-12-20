

public class FriendNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p, q;
		int num = 0;
		int f10 = (int) Math.pow(10, 18);
		int ost = f10 % 1000267129;
		System.out.println("ost=" + ost);
		for (p = 1; p < ost; p++) {

			for (q = ost-1; q >p; q--) {
				String s1 = Integer.toString(p);
				String s2 = Integer.toString(q);
				label1: for (int i = 0; i < s1.length(); i++) {
					for (int j = 0; j < s2.length(); j++) {
						if (s1.charAt(i) == s2.charAt(j) && (s1!=s2)) {
							num += 1;
							break label1;
					}
						}
						
				}
				//System.out.println(num);

			}
		}
		System.out.println(num);

	}
}