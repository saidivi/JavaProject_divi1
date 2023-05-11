package day03;

public class program4 {
	static int u=50;
	int v=30;

	public static void main(String[] args) {
		program4 xyz= new program4();
		xyz.add(10234,12);
		mul(u,xyz.v);
		div(1000,20);
		xyz.sub(100,200);
		xyz.add(10,2000);
		// TODO Auto-generated method stub

	}

	private void sub(int a, int b) {
		System.out.println(a-b);
		// TODO Auto-generated method stub
		
	}

	private static void div(int a, int b) {
	  System.out.println(a/b);
		// TODO Auto-generated method stub
		
	}

	private static void mul(int a, int b) {
		System.out.println(a*b);
		// TODO Auto-generated method stub
		
	}

	private void add(long a,int b) {
		System.out.println(a+b);
		// TODO Auto-generated method stub
		
	}

}
