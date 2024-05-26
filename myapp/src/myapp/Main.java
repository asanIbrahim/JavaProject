package myapp;

public class Main {
	 static String employeeName  = "Welcome to Onward";
	static  String address = "";
	public static void main(String[] args) {
	
      for(int i = employeeName.length()-1 ; i >= 0 ; i --) {
    	  address += employeeName.charAt(i);
      }
	System.out.println(address);
}
	
}