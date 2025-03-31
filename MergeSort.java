import java.util.Arrays;
public class MergeSort{
    public static void mergeSort(int[] array){
        if(array.length <2){
            return;
        }
        int mid = array.length/2;
        int [] left = Arrays.copyOfRange(array,0,mid);
        int[] right = Arrays.copyOfRange(array,mid,array.length);
        mergeSort(left);
        mergeSort(right);

        merge(array,left,right);
    }
    public static void merge(int[] array,int[] left,int[] right){
       int leftIndex = 0,rightIndex = 0,mergeIndex=0;

       while (leftIndex < left.length && rightIndex < right.length){
           if(left[leftIndex] <= right[rightIndex]){
               array[mergeIndex++] = left[leftIndex++];

           }else {
             array[mergeIndex++] = right[rightIndex++];
           }
       }
       while(leftIndex < left.length){
           array[mergeIndex++] = left[leftIndex++];
       }
       while(rightIndex < right.length){
           array[mergeIndex++] = right[rightIndex++];
       }
    }
    public static void main(String[] args){
        int[] array = {34,56,78,23,45,69,90};
        System.out.println("Original array:"+ Arrays.toString(array));
        mergeSort(array);
        System.out.println("Sorted array:" + Arrays.toString(array));
    }
}
