import java.util.Deque;
import java.util.LinkedList;

public class PalindromeDetector {
    public static void main(String[] args) {
        String testWord = "asa";
        char[] tWordChar = testWord.toCharArray();
        Deque<Character> word = new LinkedList<Character>();
        for (char c : tWordChar) {
            word.addFirst(c);
        }
        int palindromeScore = 0;
        for (int i = 0; i < tWordChar.length/2; i++) {
            if (word.peekFirst() == word.peekLast()) {
                word.removeFirst();
                word.removeLast();
                palindromeScore++;
            }
        }
        if (palindromeScore != tWordChar.length/2) {
            System.out.println("Not a palindrome");
        } else System.out.println("Is a palindrome");
    }
}