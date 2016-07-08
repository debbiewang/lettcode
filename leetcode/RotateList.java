package leetcode;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
//		ListNode node3 = new ListNode(3);
//		ListNode node4 = new ListNode(4);
//		ListNode node5 = new ListNode(5);
		head.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
		node2.next = null;
		ListNode first = rotateRight(head,2);
		while(first!= null){
			System.out.println(first.val);
			first = first.next;
		}

	}
    public static ListNode rotateRight(ListNode head, int k) {
    	
    	int n = 0;
        ListNode first = head;
        if(head == null)
        	return head;
    	while(first.next != null){
    		first = first.next;
    		n++;
    	}
    	if(n ==0 || k==0)
    		return head;
      
    	k = k%(n+1);
    	int index = n-k;
    	ListNode  node = null;
    	ListNode tail  = null;
    	ListNode last = null;
    	for(int i = 0 ; i <= n ; i++){
    		if(i == 0)
    			node = head;
    		else
    			
    		   node = node.next;
    		if(i == index){
    			tail = node;
    		}
    		if(i == n){
    			last = node;
    		}
    		else
    			continue;
    			
    		
    	}
    	last.next = head;
    	ListNode firstNode = tail.next;
    	tail.next = null;
    	
    	
    	return firstNode;
    }
         

}

 class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
