import java.util.Scanner;
public class LargestElementInArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int largest = arr[0];
        for(int i =1; i<n;i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest number:" + largest);
        scanner.close();


    }
}
