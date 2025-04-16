import java.util.Scanner;
public class DiagonalSum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix(n):");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i<n; i++) {
            for(int j =0; j<n; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int primarySum =0;
        int secondarySum = 0;
        for(int i =0; i <n; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][n-1-i];
        }
        int totalSum = primarySum + secondarySum;
        if(n % 2 == 1) {
            totalSum -= matrix[n /2][n/2];
        }
        System.out.println("Sum of diagonals:" + totalSum);
        scanner.close();
    }
}
