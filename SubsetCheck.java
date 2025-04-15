public class SubsetCheck {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        // Loop through each element of arr2
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false; // flag to check if current element is found

            // Search for arr2[i] in arr1
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true; // element found
                    break; // break inner loop
                }
            }

            // If the element from arr2 was not found in arr1, return false
            if (!found) {
                return false;
            }
        }

        // All elements found
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        if (isSubset(arr1, arr2)) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is NOT a subset of arr1");
        }
    }
}
