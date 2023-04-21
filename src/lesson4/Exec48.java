package lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exec48 {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> characterList = new LinkedList<>();
        for (char c : s.toCharArray()) {
            characterList.add(c);
        }
        System.out.println(characterList);

        ListIterator<Character> forwardIterator = characterList.listIterator();
        ListIterator<Character> reverseIterator = characterList.listIterator(characterList.size());

        boolean isPalindrome = true;

        while (forwardIterator.hasNext() && reverseIterator.hasPrevious()) {
            if (forwardIterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(s + " - Palindrome");
        } else {
            System.out.println(s + " - Not Palindrome");
        }
    }
}
