package leetcode.validParenthesis;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		System.out.println(new Solution().isValid("()[]{"));
	}
}

class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		while (!s.equals("")) {
			Character ch = s.charAt(0);
			if (isOpen(ch))
				stack.add(ch);
			else {
				if (stack.isEmpty())
					return false;
				Character chPoped = stack.pop();
				if (!isMatched(chPoped,ch))
					return false;
			}
			s = s.substring(1);
		}
		return true;
	}

	private boolean isMatched(Character ch, Character chPoped) {
		switch (ch) {
		case '(':
			return chPoped.equals(')');

		case '{':
			return chPoped.equals('}');

		case '[':
			return chPoped.equals(']');

		default:
			break;
		}
		return false;
	}

	private boolean isOpen(Character ch) {
		if (ch.equals('(') || ch.equals('{') || ch.equals('['))
			return true;
		return false;
	}
}