package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**题目要求：每一行尽可能多的摆放单词
	 * 当每行不够L个字符的时候，添加空格。空格的添加应该尽可能的均匀。
	 * 如果不能均匀的摆放空格，则左边的空格应该比右边的空格多。
	 * 最后一行应该按照从左开始摆放单词，并且单词之间不应该留有多余的空格
	 * @param words
	 * @param maxWidth
	 * @return
	 */
   public List<String> fullJustify(String[] words, int maxWidth) {
	   if(words == null) return null;
       List<String> res = new ArrayList<String>();
       if(words.length == 0) return res;

       int i = 0;
       while(i < words.length){
           int count = 0;
           int sum = 0;
           String s = "";

           while(i < words.length && sum <= maxWidth + 1){
               if(sum + words[i].length() > maxWidth){ // no need to add.
                   break;
               }else{ // add one word and a space.
                   count++;
                   sum += words[i].length();
                   sum++; //the last step add an extra space. 
                   i++;
               }
           }
          // meet the end or only have one word--> Left justification.
               if(count == 1 || i > words.length - 1){ 
                   for(int k = i - count; k < i; k++){
                       s += words[k];
                       if(k == i - 1){break;} // last word
                       s += " ";
                   }
                   while(s.length() < maxWidth){
                       s += " "; 
                   }
               //middle justification
               }else{
                   int avespace = (maxWidth - sum + 1) / (count - 1);
                   int reminder = (maxWidth - sum + 1) % (count - 1);

                   for(int k = i - count; k < i; k++){
                       s += words[k];
                       if(k == i - 1){break;} // last word

                       //Extra spaces between words should be distributed as evenly as possible. 
                       // add one regular space and #average space.
                       for(int kk = 0; kk <= avespace; kk++){ 
                           s += " ";
                       }
                       //If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right. 
                       if(k < i - count + reminder){ // a
                           s += " ";
                       }
                   }
               }//
           res.add(s);
       }
       return res;
    }

}
