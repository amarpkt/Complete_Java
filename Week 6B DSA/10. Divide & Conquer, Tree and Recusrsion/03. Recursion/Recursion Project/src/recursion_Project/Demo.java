package recursion_Project;

public class Demo {
	public static void main(String[] args) {
		//f1();
		//f2(10);
		int result = factorial(6);
		System.out.println(result);
	}

	public static void f1() {
		int i = 0;
		System.out.println(i);
		f1();
	}
	public static void f2(int i) {
		System.out.println(i);
		if(i >0) {
			f2(i-1);
		}
	}
	public static int factorial(int i) {
		if(i!=0) {
			return i* factorial(i-1);
		}
		return 1;
	}
}
