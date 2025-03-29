import java.util.Scanner;
public class FibonacciNum{
    public static int fibonacci(int n){
        if(n==0) return 0;
        if (n== 1) return 1;
        return fibonacci(n-1)+ fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position(n) to find the fibonacci number:");
        int n = scanner.nextInt();
        System.out.println("Fibonacci number at position"+" "+ n+" "+ "is:"+ fibonacci(n));
        scanner.close();
    }


    }




