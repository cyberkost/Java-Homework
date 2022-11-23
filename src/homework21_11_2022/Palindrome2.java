package homework21_11_2022;

public class Palindrome2 {
    public static void main(String [] args){
        Palindrome2 pn = new Palindrome2();

        if(pn.isPalindrome2("мотор")){
            System.out.println("Palindrome, True");
        } else {
            System.out.println("Not Palindrome, False");
        }
    }
    public boolean isPalindrome2(String original){
        int i = original.length() - 1;
        int j = 0;
        while(i > j) {
            if(original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
