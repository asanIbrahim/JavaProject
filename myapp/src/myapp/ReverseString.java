package myapp;

public class ReverseString {
	 static String welcomeMsg = "Hi Asan Ibrahim welcome to onward tech";
	 static String res = "";
	
	public static void displayres () {
		for(int i =welcomeMsg.length()-1 ; i >=0 ; i-- ) {
			res+= welcomeMsg.charAt(i);
		}
		System.out.println(res);
	}
}


