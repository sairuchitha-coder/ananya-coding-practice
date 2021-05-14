package in.ruchitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;

public class MaximumWealth {
    public static void main(String[] args) {
        MaximumWealth obj = new MaximumWealth();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(obj.maximumWealth(matrix));
    }
        public int maximumWealth(int[][] accounts) {

            int msum = 0; //maxsum or max_wealth

            for (int i = 0; i < accounts.length; i++) {  //iterating through the rows
                int sum = 0;
                for (int j = 0; j < accounts[0].length; j++) {   //iterating through the columns
                    sum += accounts[i][j];
                }
                msum = Math.max(msum, sum);
            }
            return msum;

        }
    }
