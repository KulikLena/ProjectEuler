
public class Outer {
	
 public Outer () {
	 System.out.println("Outer");
 }
 void test () {
 Inner obj1 = new Inner ();
 obj1.binn();
 }

 class Inner {
	 public Inner () {
		 System.out.println("Inner");
	 }
	 void binn() {
		 System.out.println("u");
	 }
	
	 
 }
	public static void main(String[] args) {
		Outer obj = new Outer ();
		obj.test();
	

	}

}
