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

        for(int i=dp_array.length-1; i>=0; i--){
            for(int j=dp_array[0].length-1;j>=0;j--){
                if(i==dp_array.length-1 && j==dp_array[0].length-1){
                    dp_array[i][j]= array[i][j];
                } else if(i==dp_array.length-1){
                    dp_array[i][j]= dp_array[i][j+1]+array[i][j];
                } else if(j==dp_array[0].length-1){
                    dp_array[i][j]= dp_array[i+1][j]+array[i][j];
                }
            }
        }


    }
}
