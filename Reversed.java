import java.util.Scanner;
public class Reversed{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();

        int reversedNum = 0;
        while (num != 0) {
    int lastDigit = num%10;
    reversedNum = reversedNum * 10 + lastDigit;
    num = num/10;

        }
        System.out.println("Reversed number:" + reversedNum);
        scanner.close();
    }
}
