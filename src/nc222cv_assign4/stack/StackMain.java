package nc222cv_assign4.stack;

public class StackMain {
	private static StackContainer container;
	
	public static void main(String[] args) {
		container = new StackContainer();
		
		System.out.println("Container is empty: " + container.isEmpty());
		
		container.push("1");
		container.push(2);
		
		System.out.println("elements: " + toString(container));
		
		System.out.println("pop: " + container.pop().toString());
		
		System.out.println("elements: " + toString(container));
		
		System.out.println("peek: " + container.peek().toString());
		
		System.out.println("elements: " + toString(container));
	}
	
	private static String toString(StackContainer list) {
		String str = "";
		
		for(int i = 0, length = list.size(); i < length; i++) {
			str += list.iterator()[i] + " ";
		}
		
		return str;
	}
}
