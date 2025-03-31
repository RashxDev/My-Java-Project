import java.util.Scanner;
public class SecondLargestNumber{
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        if(n<2) {
            System.out.println("Array must have at leats two elemets!");
           return;
        }
        int[] arr = new int [n];
        System.out.println("Enter the elements of array:");
        for(int i= 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("No second largest number found(all elements are the same).");

        }else{
            System.out.println("Second largest number:"+ secondLargest);
        }
        scanner.close();
    }
}
