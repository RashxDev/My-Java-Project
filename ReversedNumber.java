import java.util.Scanner;
public class ReversedNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        int reversed = 0;
        while (num !=0){
            int digit = num% 10;
            reversed = reversed *10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number:" + reversed);
        scanner.close();
    }
}
