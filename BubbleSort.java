import java.util.Scanner;
public class BubbleSort{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elements of array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i=0; i<n-1; i++){
            for(int j= 0;j<n-1-i;j++){
                if (arr[j] > arr[j+ 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array:[");
        for (int i=0; i <n; i ++){
            System.out.println(arr[i]);
            if(i<n-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
        scanner.close();
    }
}
