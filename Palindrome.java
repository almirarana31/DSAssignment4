import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter any string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        Deque<Character> deque = fillStack(input);
        String reversedString = buildReverse(input);
        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " not a Palindrome");
        }

    }

    private static Deque<Character> fillStack(String inputString) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : inputString.toCharArray()) {
            deque.push(c);
        }
        return deque;
    }

    private static String buildReverse(String inputString) {
        Stack<Character> stack = new Stack<>();
        for (char i : inputString.toCharArray()) {
            stack.push(i);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String inputString) {
        String processedInput = inputString.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = buildReverse(processedInput);
        return processedInput.equals(reversed);

    }
}
