package nc222cv_assign3;

public class Arrays {
	public static void main(String[] args) {
		int[] n = {3, 4, 5, 6, 7};
		int[] k = {4, 4, 5, 6, 7};
		int[] a = {3, 8};
		int[] m = {32, 91, 10, 21};
		int[] j = {1,2,3,4};
		int[] h = {1,2,3};
		
		System.out.println("sum: " + sum(n));
		System.out.println("toString: " + toString(n));
		System.out.println("addN: " + toString(addN(n, 8)));
		System.out.println("reverse: " + toString(reverse(n)));
		System.out.println("hasN: " + hasN(n, 4));
		replaceAll(k, 4, 8);
		System.out.println("sort: " + toString(sort(m)));
		System.out.println("hasSubsequence:" + hasSubsequence(n, a));
		System.out.println("isLarger(true means a1 larger, false is opposite): " + isLarger(j, h));
	}
	
	private static int sum(int[] arr) {
		int total = 0;
		for(int i = 0, length = arr.length; i < length; i++) {
			total += arr[i];
		}

		return total;
	}
	
	private static String toString(int[] arr) {
		String str = "[";
		for(int i = 0, length = arr.length; i < length; i++) {
			
			if(i == length - 1)
				str += arr[i];
			else
				str += arr[i] + ",";
		}
		str += "]";
		
		return str;
	}
	
	private static int[] addN(int[] arr, int n) {
		int[] list = new int[arr.length + 1];
		for(int i = 0, length = arr.length; i < length; i++) {
			list[i] = arr[i];
		}
		
		list[arr.length] = n;
		
		return list;
	}
	
	private static int[] reverse(int[] arr) {
		int[] tempArr = new int[arr.length];
		for(int i = 0, length = arr.length; i < length; i++){ 
			tempArr[i] = arr[length - i - 1];
		}
		
		return tempArr;
	}
	
	private static boolean hasN(int[] arr, int n) {
		for(int i = 0, length = arr.length; i < length; i++) {
			int temp = arr[i];
			if(temp == n) {
				return true;
			}
		}
		return false;
	}
	
	private static void replaceAll(int[] arr, int old, int nw) {
		for(int i = 0, length = arr.length; i < length; i++)
		{
			int temp = arr[i];
			if(temp == old) {
				arr[i] = nw;
			}
		}
		System.out.println("replaceAll: " + toString(arr));
		//System.out.print(arr);
	}
	
	private static int[] sort(int[] arr) {
		int[] sortedArray = new int[arr.length];
		
		for (int i = 0, length = arr.length; i < length; i++) { // run the loop
			sortedArray[i] = arr[i];
		}
		
		for (int i = 0, length = sortedArray.length; i < length; i++) { // run the loop
			for (int j = 0; j <= length - 2; j++) {
				if (sortedArray[j] > sortedArray[j + 1]) { 
					int temp = sortedArray[j];
					sortedArray[j] = sortedArray[j + 1];
					sortedArray[j + 1] = temp;
				}
			}
		}

		return sortedArray;
	}
	
	private static boolean hasSubsequence(int[] arr, int[] sub) {
		String arrStr = "";
		String subStr = "";
		
		for (int i = 0, length = arr.length; i < length; i++) {
			arrStr += arr[i];
		}
		
		for (int i = 0, length = sub.length; i < length; i++) { 
			subStr += sub[i];
		}
		
		return arrStr.contains(subStr);
	}
	
	private static boolean isLarger(int[] a1, int[] a2) {
		int length;
		
		if(a1.length > a2.length) {
			length = a1.length;
			if(hasSubsequence(a1, a2)) {
				return true;
			}
		}
		else {
			length = a2.length;
			if(hasSubsequence(a2, a1)) {
				return false;
			}
		}
			
		for(int i = 0; i < length; i++) {
			int temp1 = a1[i];
			int temp2 = a2[i];
			if(temp1 > temp2) {
				return true;
			}
			else if(temp1 < temp2) {
				return false;
			}
		}
		
		return true;
	}
}
