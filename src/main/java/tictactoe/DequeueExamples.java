package tictactoe;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExamples {

	public static void main(String args[]) {

		Deque<String> dq = new ArrayDeque<>();

		dq.add("A");
		dq.add("B");
		dq.add("C");
		dq.add("D");

		for (String s : dq) {
			System.out.print(s + " ");
		}

		String remove = dq.remove();
		dq.addLast(remove);

		System.out.println("");

		for (String s : dq) {
			System.out.print(s + " ");
		}

		dq.addLast("E");
		dq.addLast("F");

		System.out.println("");

		for (String s : dq) {
			System.out.print(s + " ");
		}

	}

}
