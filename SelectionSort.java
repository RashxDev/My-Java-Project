import java.util.Scanner;
public class SelectionSort{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] =scanner.nextInt();
        }

        for(int i=0; i< n-1; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.print("Sorted array:[");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
            if(i <n -1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        scanner.close();

    }
}
