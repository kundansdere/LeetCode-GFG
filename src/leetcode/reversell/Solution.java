package leetcode.reversell;

import java.util.Stack;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

}
public class Solution {
	private ListNode getResese(ListNode start) {
		Stack<ListNode> stack = new Stack<>();
		while (start != null) {
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
