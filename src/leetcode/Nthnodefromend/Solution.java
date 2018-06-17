package leetcode.Nthnodefromend;

public class Solution {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode node = head;
		int count = 0;
		while (count < n && node != null) {
			count++;
			node = node.next;
		}
		if (node == null && count == n)
			return head.next;
		if (node == null && count != n)
			return head;
		
		ListNode result = head;
		while (node.next != null) {
			node = node.next;
			result = result.next;
		}
		result.next = result.next.next;

		return head;
	}
}
