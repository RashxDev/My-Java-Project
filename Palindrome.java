import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0){
            int lastDigit = num %10;
            reversedNum = reversedNum *10 + lastDigit;
            num = num/10;
        }
        if(originalNum == reversedNum){
            System.out.println(originalNum + "is a palindrome number");
        }else {
            System.out.println(originalNum + "is not a palindrome number.");

        }
        scanner.close();

    }
}
