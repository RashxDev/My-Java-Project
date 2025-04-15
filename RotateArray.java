public class RotateArray{
    public static void rotate(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        int[] result = new int[n];
        for(int i =0; i<n; i++){
            result[(i+k)%n] = arr[i];

        }
        for(int i=0; i <n;i++) {
            arr[i] = result[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=3;
        rotate(arr,k);
        System.out.print("Rotated array:");
        for(int num: arr) {
            System.out.print(num + " ");
        }
    }

}
