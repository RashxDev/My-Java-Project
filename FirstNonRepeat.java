public class FirstNonRepeat{
    public static void main(String[] args){
        int[] arr = {9,4,9,6,7,4};
        int n = arr.length;
        boolean found = false;

        for (int i=0; i<n; i++) {
            boolean isRepeating = false;

            for(int j=0;j<n;j++) {
                if(i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }
            if(!isRepeating) {
                System.out.println("First non repeating element is:"+ arr[i]);
                found =true;
                break;
            }
        }
        if(!found) {
            System.out.println("All lements are repeating.");
        }
    }
}
