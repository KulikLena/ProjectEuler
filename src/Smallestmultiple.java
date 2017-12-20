//problem5

public class Smallestmultiple {

	public static void main(String[] args) {
		int i;
		boolean isdividor = false;
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12,13,14,15,16,17,18,19,20 };

		 for (i = 10;; i++) {
			 lab1: for (int x : a) {

				if (i % x == 0)
					isdividor = true;

				else {
					isdividor = false;
					break lab1;
				}
			 }
		 
			
			if (isdividor) {
				System.out.println(i);
				break;
				

			}
		 }
		}

	}

