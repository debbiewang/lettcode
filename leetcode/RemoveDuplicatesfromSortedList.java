package leetcode;

public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		deleteDuplicates(head);
		while(head!= null){
			System.out.println(head.val);
			head = head.next;
		}

	}
    public static ListNode deleteDuplicates(ListNode head) {

    	if (head == null || head.next == null) return head;

        ListNode fakeHead = head;
        while (fakeHead.next != null) {
            if (fakeHead.val == fakeHead.next.val) { // duplicate values, make the next as next.next
            	fakeHead.next = fakeHead.next.next;
            } else { // otherwise, advance runner to runner.next
            	fakeHead = fakeHead.next;
            }
        }

        return head;
    }
     

}
