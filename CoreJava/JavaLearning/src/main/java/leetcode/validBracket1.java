package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class validBracket1 {
public static void main(String[] args) {
	System.out.println(isValid("([)]"));
}
static boolean isValid(String s) {
    // Create a new stack to store the characters.
    List<Character> stack = new ArrayList<>();


    // convert string into char array and access the characters using for each loop.
    for(char ch: s.toCharArray())
    {
        // check ch
        switch (ch)
        {
            // open bracket then push it in stack.
            // close bracket then pop the item and compare.
            case '(':
            case '{':
            case '[':
                stack.add(ch);
                break;
            case ')':
                if(stack.isEmpty() || stack.remove(stack.size()-1) != '(')

                // if the stack is empty then it means string have no open bracket.
                    // hence it is invalid.
                {
                    return false;
                }
                break;
            case '}':
                if(stack.isEmpty() ||  stack.remove(stack.size()-1) != '{')
                {
                    return false;
                }
                break;
            case ']':
                if(stack.isEmpty() ||  stack.remove(stack.size()-1) != '[')
                {
                    return false;
                }
                break;
        }
    }


    // After the loop we have to check one more condition.
    // return true only if the stack is empty.
    // if stack is not empty that means we have unused brackets.

    return stack.isEmpty();
    
}

}
