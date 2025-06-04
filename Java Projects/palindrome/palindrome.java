/**
 * palindrome
 */
import java.util.Scanner;
public class palindrome {

    public static boolean checkPalindrome(String word) {
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enteaßr in a word");

        System.out.println(checkPalindrome(in.nextLine()));


        

        in.close();

    }
}