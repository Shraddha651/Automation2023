package LogicalPrograms;

public class pallindrome_string {
	
	public static void main(String[] args) {
		//reverse order and origional order is same
		
		String str = "radar";
		String rev ="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("origional string:"+str);
		System.out.println("reverce string:"+rev);		
		
		if(str.equals(rev)) {
			System.out.println("given string is pallindrome");
		}else {
			System.out.println("given string is not pallindrome");
		}
	}
	

}
