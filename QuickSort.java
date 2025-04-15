import java.util.Arrays;

public class QuickSort {

    // The main QuickSort function
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array, pivot is at correct position
            int pivotIndex = partition(array, low, high);

            // Recursively sort the elements before and after partition
            quickSort(array, low, pivotIndex - 1);  // Left of pivot
            quickSort(array, pivotIndex + 1, high); // Right of pivot
        }
    }

    // This function partitions the array and returns the index of pivot
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as pivot
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++; // move the smaller element pointer
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the partition index
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Original Array: " + Arrays.toString(array));
        
        quickSort(array, 0, array.length - 1); // Perform Quick Sort

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
