package myapp;

public class Main {
	public static void main(String[] args) {
	Asan.add(10);
	Asan.addNumber();
	ApplicationForm applicationForm = new ApplicationForm();
	applicationForm.Name = "Asan Ibrahim";
	Asan values = new Asan();
	Asan.addNumber();
	ReverseString result = new ReverseString();
	ReverseString.displayres();

	int n = 5 ;
	
	String star = "";
	
	for(int i = 1 ; i<= n ; i++) {
	  for(int j = 1 ; j<= n-i; j++) {
		  star += " ";
	  }
	  for(int k = 0 ; k < 2* i -1 ; k++) {
		  star +="*";
	  }
	   
	  star+= "\n";
	}
	
	System.out.print(star);
	
	

	}	

}