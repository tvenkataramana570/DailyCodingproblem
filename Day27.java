/*

Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).
For example, given the string "([])[]({})", you should return true.
Given the string "([)]" or "((()", you should return false.

*/
import java.util.*;

public class Main{
    
	static boolean Balanced(String expr)
	{
		Deque<Character> stack
			= new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++)
		{
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{')
			{
				stack.push(x);
				continue;
			}

			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		// Check Empty Stack
		return (stack.isEmpty());
	}

	public static void main(String[] args)
	{
		String expr = "([{}])";

		if (Balanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
