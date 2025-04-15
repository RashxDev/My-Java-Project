import java.util.Scanner;
public class PalindromeString{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string:");
        String input = scanner.nextLine();

        String str = input.toLowerCase();

        boolean isPalindrome = true;

        for (int i =0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println(input +" "+"is a palindrome.");
        }else {
            System.out.println(input + "is not a palindrome.");
        }
        scanner.close();
    }
}
