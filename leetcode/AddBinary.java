package leetcode;

public class AddBinary {

	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		String res = addBinary(a, b);
		System.out.println(res);
		

	}
	 public static String addBinary(String a, String b) {
		 char[] aArray = a.toCharArray();
		 char[] bArray = b.toCharArray();
		 int n = aArray.length;//确保n是较大的那个长度
		 int m = bArray.length;
		 int maxLength = Math.max(n, m);
		 int[] result = new int[maxLength];
		 if(n<m)
			 return addBinary(b, a);
		 int dis = Math.abs(n-m);
		 int carry = 0;//代表进位
		 for(int i = 0;i < n ;i++){
			 int tempA = (n-1-i >= 0) ?(aArray[n-1-i] - '0'):0;
			 int tempB = (m-1-i >= 0) ?(bArray[m-1-i] - '0'):0;
			 int sum = tempA + tempB + carry;
			 if(sum %2 ==0){
				   carry = sum/2;
				   result[maxLength-1-i] = 0;
				 }else{
					 carry = sum/2;
					 result[maxLength-1-i] = 1;
				 }
				   
				 
			 }
		 //最后有进位的情况，
		String res = "";
		for(int i = 0 ; i < maxLength; i++)
			res += result[i];
		 if(carry == 1)
			 return "1" + res;
		else
		     return res;
		
		 }

}
