public class PracticeClass {                                                       // creation of class
	int z = 5*8;                                                              // storing a value in a primitive variable, instance variable 
	static int y = 40;                                                        // primitive variable, static variable
	int ag = 534;
	
	int temp(int a) {
		return a+z;
	}
	
	int sum(int a, int b) {                                                   // creating a method , lengthy way
		int c;
		int m = 500;                                                          // how do i print out c ? 
		c = a+ b;
		return c;
	}
	
	float divide(float a, float b) {
		return a/b;
	}
	
	float merit(float marks, float attempted) {
		float accuracy = marks/attempted;                                       // local variable, primitive variable ?
		float percentage = (marks/100)*100;
		return (accuracy + percentage)/2*100;
	}
	
	void voidMethod() {
		int a = 5;                                                              // local variable, instance area
		System.out.println(" void method result is " + a);   
	}
	
	static void m2() {                                                          // 
		int a  = 55;                                                            // static area
		System.out.println("static void is - " + a); 
	}

	
	public static void main(String[] args) {
		int ab = 56;                                                            // ab is local variable inside main method 
		
		PracticeClass s = new PracticeClass();                                            // creation of object, reference variable 
		PracticeClass obj2 = new PracticeClass();
		
		//System.out.println(s.);                                                          not working
		
		System.out.println("local main variable is " + ab);
		System.out.println("results are - ");
		System.out.println("z value is " + new PracticeClass().z);                   // temporary object just for single use
		System.out.println("sum is - " + s.sum(10, 40));
		System.out.println("divide is - " + s.divide(50.35f, 3.03f));
		System.out.println("");
		System.out.println("merit is - " + s.merit( 90, 100));
		
		obj2.voidMethod();                                                       // for printing out void
		s.m2();
		//System.out.println(s.voidMethod());                                    // not working because -   
		//System.out.println(s.m1());

		obj2.y = 41;                                                           // y is static. once changed, will be changed in all objects
		System.out.println(s.y);
		
	}
}
