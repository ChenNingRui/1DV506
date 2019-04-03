package nc222cv_assign3;

import java.text.SimpleDateFormat;

public class SweID {
	public static void main(String[] args) {
		String sweidST = "640123-8826";//a correct female number
		String sweidth = "050229-8826";//a correct male number
		String swesidrd = "550414-0912";//unvalid last digit
		
		getFirstPart(sweidST);
		getSecondPart(sweidST);
		isFemaleNumber(sweidST);
		areEqual(sweidST, sweidth);
		
		try {
			System.out.println(isCorrect(swesidrd));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String getFirstPart(String sid) {
		String[] strArr = sid.split("-");
		return strArr[0];
	}
	
	private static String getSecondPart(String sid) {
		String[] strArr = sid.split("-");
		return strArr[1];
	}
	
	private static boolean isFemaleNumber(String sid) {
		//the last digit among three, an odd number is assign to female.
		if((sid.charAt(9) % 2 == 0)) {
			return true;
		}
		
		return true;
	}
	
	private static boolean areEqual(String id1, String id2) {
		if(id1 == id2) {
			return true;
		}
		return false;
	}
	
	private static boolean isCorrect(String sid) throws Exception {
		Boolean isdata = checkDate(sid.split("-")[0]);
		boolean isChecksum = checksucalCulation(sid);
		System.out.println("data: " + isdata);
		System.out.println("checksum: " + isChecksum);
		return (isdata && isChecksum);
	}
	
	private static boolean checkDate(String inDate) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
		
		if (inDate.trim().length() != dateFormat.toPattern().length())
			return false;
		
	    dateFormat.setLenient(false);
	    
	    try {
			dateFormat.parse(inDate.trim());
		} catch (java.text.ParseException e) {
			//e.printStackTrace();
			System.out.println("the date is illegal!");
			return false;
		}
	    
	    return true;
	}
	
	private static boolean checksucalCulation(String sid) {
		String date = sid.split("-")[0];
		String originChecksum = sid.split("-")[1];
		String tempStr = date + originChecksum;
		
		int lastSum;
		int minusDigit = 0; 
		
		if(date.length() != 6 || originChecksum.length() != 4){
			return false;
		}
		
		int sum = 0;

		for(int i = 0, length = tempStr.length(); i < length; i++) {
			int num = Integer.parseInt(tempStr.split("")[i]);
			String str = "";
			
			switch(i) {
			case 0:
				num = num * 2;
				str = String.valueOf(num);
				if(str.length() >= 2) {
					num = Integer.parseInt(str.split("")[0]) + Integer.parseInt(str.split("")[1]);
				}
				break;
			case 1:
				break;
			case 2:
				num = num * 2;
				break;
			case 3:
				break;
			case 4:
				num = num * 2;
				break;
			case 5:
				break;
			case 6:
				num = num * 2;
				str = String.valueOf(num);
				if(str.length() >= 2) {
					num = Integer.parseInt(str.split("")[0]) + Integer.parseInt(str.split("")[1]);
				}
				break;
			case 7:
				break;
			case 8:
				num = num * 2;
				str = String.valueOf(num);
				if(str.length() >= 2) {
					num = Integer.parseInt(str.split("")[0]) + Integer.parseInt(str.split("")[1]);
				}
				break;
			case 9:
				str = String.valueOf(sum);
				lastSum = sum;
				if(str.length() >= 2) {
					lastSum = Integer.parseInt(str.split("")[1]);
				}
				
				minusDigit = 10 - lastSum;
				
				if(minusDigit == num)
					return true;
				break;
			}
			
			sum += num;
		}
		
		System.out.println("the checksum is illegal!");
		return false;
	}

}
