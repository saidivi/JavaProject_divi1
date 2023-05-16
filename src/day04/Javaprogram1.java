package day04;

public class Javaprogram1 {

	public static void main(String[] args) {
		Javaprogram1 abc= new Javaprogram1();
		int x=add(20,40);
		System.out.println(x*x);
		System.out.println(x*x*x);
		
		long y=abc.sub(50,20);
		

	}

	public int sub(int a, int b) {
		return a-b;
		
	}

	public static int add(int a, int b) {
		System.out.println(a+b);
		return a+b;		
		
	}

}
