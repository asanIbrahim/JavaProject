package myapp;

public class Asan {

	public static void add(int n) {
		
		if( n == 1) {
			System.out.println(1);
		}
		else {
			System.out.println(n);
			add(n-1);
		}
	}
	
	public static void addNumber(int val) {
		
	}
}