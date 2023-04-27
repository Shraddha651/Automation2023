package LogicalPrograms;

public class ReverceString {
	
	public static void main(String[] args) {
		
		String str ="quantum academy";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
			
		}
		System.out.println("Origional String:"+str);
		System.out.println("reverse String:"+rev);
	}

}
