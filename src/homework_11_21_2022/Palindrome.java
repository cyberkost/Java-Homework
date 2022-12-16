package homework_11_21_2022;

import java.util.LinkedList;
import java.util.ListIterator;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("dom"));
        System.out.println(palindrome("Madam"));
        System.out.println(palindrome("mama"));
        System.out.println(palindrome("moom"));
    }

    public static boolean palindrome(String str) {
        String s = str.toLowerCase();
        char[] charsArray = s.toCharArray();
        LinkedList<Character> linkedList = new LinkedList<>();
        LinkedList<Character> linkedListCopy = new LinkedList<>();
        for (char charAr: charsArray) {
            linkedList.add(charAr);
            linkedListCopy.add(charAr);
        }

        ListIterator<Character> iteratorNext = linkedList.listIterator();
        ListIterator<Character> iteratorPrevious = linkedListCopy.listIterator(charsArray.length);

        for (int i = 0; i < linkedList.size() / 2; i++) {
            if (iteratorNext.next() != iteratorPrevious.previous()){
                return false;
            }
        }
        return true;
    }
}


