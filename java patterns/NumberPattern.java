
public class NumberPattern {
    public static void main(String[] args) {

        int n = 4;        
        int num = 1;

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) { 
               
                for (int j = 0; j < n; j++) {
                    arr[i][j] = num++;
                }
            } else {
                
                for (int j = n - 1; j >= 0; j--) {
                    arr[i][j] = num++;
                }
            }
        }

        for (int[] row : arr) {
            for (int val : row) {
                System.out.printf("%02d ", val);
            }
            System.out.println();
        }
    }
}
