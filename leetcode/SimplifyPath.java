package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/home//foo/";
		String res = simplifyPath(path);
		System.out.println(res);

	}
	//case1 : . 不做任何处理
	//case2: .. 出栈
	//case3: 其他的情况则进栈
    public static String simplifyPath(String path) {
    	Stack stack  = new Stack();
    	
    	char[] chs = path.toCharArray();
    	String[] strs = path.split("/");
    	for(int i = 1 ; i < strs.length;i++){
    		if(strs[i].equals("."))
    		    continue;
    		else if(strs[i].equals("..")){
    			if(!stack.isEmpty())
    				stack.pop();
    		}else if(!strs[i].equals(""))
    			stack.push(strs[i]);
    			
    		
    	}
    	//对栈进行处理
		StringBuffer result = new StringBuffer();
		if(stack.isEmpty())
			return "/";
		else{
			while(!stack.isEmpty()){
				result.insert(0,stack.pop());
				result.insert(0, "/");
				
			
			}

	    	return result.toString();
		}
		
        
    }

}
