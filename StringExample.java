package String;

public class StringExample {
	public static void main(String[] args) throws Exception {
		System.out.println(Add("1\\n2,3"));
		
	}
	static int Add(String number) throws Exception {
		int sum=0;
        String temp = "0";

		for(int i=0;i<number.length();i++)
		{
			Character ch =number.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;
			}else {
				sum += Integer.parseInt(temp);
				temp = "0";
				
			}
			
		}
		return sum + Integer.parseInt(temp);
		
	}

}
