package nc222cv_assign2;

public class Reverse {
	public static void main(String[] args) {
		 char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 
      			's', 'i', 'h', 'T' };
		         			
		// Continue here ...
		
		System.out.println(text);
		
		System.out.println(reverseCharArray(text));
	}
	
	private static char[] reverseCharArray(char[] list) {
		list =  new StringBuilder(new String(list)).reverse().toString().toCharArray();
		return list;
	}
}
