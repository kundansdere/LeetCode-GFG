package leetcode.removeMtoN;

import java.util.Stack;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

}

public class Solution {

	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;

		new Solution().reverseBetween(head1, 2, 2);
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode myHead = new ListNode(-1);
		myHead.next = head;

		ListNode result = myHead;
		int count = 0;
		ListNode mPoint = myHead, nPoint = myHead;
		while (count < m - 1) {
			mPoint = mPoint.next;
			count++;
		}
		count = 0;
		while (count <= n) {
			nPoint = nPoint.next;
			count++;
		}
		ListNode end = nPoint;
		ListNode reverse = getResese(mPoint.next, end);

		mPoint.next = reverse;
		while (reverse.next != null)
			reverse = reverse.next;
		reverse.next = end;

		return myHead.next;
	}

	private ListNode getResese(ListNode start, ListNode end) {
		Stack<ListNode> stack = new Stack<>();
		while (start != end) {
			stack.push(start);
			start = start.next;
		}
		ListNode head = null;
		ListNode list = null;
		while (!stack.isEmpty()) {
			ListNode node = stack.pop();
			if (head == null) {
				head = node;
				list = head;
			} else {
				list.next = node;
				list = list.next;
			}
		}
		if (list != null)
			list.next = null;

		return head;
	}
}
