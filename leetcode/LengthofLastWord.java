package leetcode;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello world";
		int size = lengthOfLastWord(s);
		System.out.println(size);

	}
	 public static int lengthOfLastWord(String s) {
		 int size = 0;
		 String[] strs = s.split(" ");
		 if(strs.length < 1)
			 return 0;
		 else{
			 String s1 = strs[strs.length-1];
			 return s1.length();
		 }
			 
		 
	        
	  }

}
