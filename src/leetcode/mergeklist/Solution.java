package leetcode.mergeklist;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {

	public static void main(String[] args) {
		ListNode[] lists = new ListNode[3];

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		lists[0] = node1;

		ListNode node11 = new ListNode(1);
		ListNode node21 = new ListNode(3);
		ListNode node31 = new ListNode(4);
		node11.next = node21;
		node21.next = node31;
		lists[1] = node11;

		ListNode node12 = new ListNode(2);
		ListNode node22 = new ListNode(6);
		node12.next = node22;
		lists[2] = node12;

		new Solution().mergeKLists(lists);
	}

	public ListNode mergeKLists(ListNode[] lists) {
		ListNode result = null;
		ListNode temp = null;

		while (true) {
			ListNode node = minHead(lists);
			if (node == null)
				break;
			if (result == null) {
				result = node;
				temp = result;
				node.next = null;
			} else {
				temp.next = node;
				temp = temp.next;
				node.next = null;
			}
		}
		return result;
	}

	private ListNode minHead(ListNode[] lists) {
		int min = Integer.MAX_VALUE;
		ListNode result = null;
		int index = 0;
		if (lists.length == 0)
			return null;
		else {
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null && min > lists[i].val) {
					min = lists[i].val;
					result = lists[i];
					index = i;
				}
			}
		}
		if (result != null)
			lists[index] = lists[index].next;
		return result;
	}
}
