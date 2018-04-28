package champion;

import edu.princeton.cs.algs4.Stack;

public class helloalgs4 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("algs4!");
		stack.push("Hello");

		while (stack.size() > 0) {
			System.out.print(stack.pop());
			if (stack.size() > 0) {
				System.out.print(" ");
			}
		}
	}
}
