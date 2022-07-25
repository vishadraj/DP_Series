/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 25-07-2022
 */

import java.util.Scanner;

public class MinimumPathSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();

        int [][] array = new int[row][col];
        for (int i=0;i<array.length; i++){
            for(int j=0; j<array[0].length; j++) {
                array[i][j] = input.nextInt();
            }
        }

        int [][] dp_array = new int[row][col];



    }
}
