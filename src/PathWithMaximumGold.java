/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 26-07-2022
 */

import java.util.Scanner;

public class PathWithMaximumGold {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int [][] array = new int[row][col];
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[0].length; j++){
                array[i][j] = input.nextInt();
            }
        }
        int [][] dp_array = new int[row][col];

        for(int j= array[0].length-1; j>=0 ; j--){
            for(int i=array.length-1; i>=0;i--){
                if(j==array[0].length-1) // if we are at last column
                {
                    dp_array[i][j]= array[i][j];
                } else if(i==0) // if we are at first row
                {
                    dp_array[i][j]= array[i][j] + Math.max(dp_array[i][j+1],dp_array[i+1][j+1]);
                } else if(i==array.length-1) // if we are at last row
                {
                    dp_array[i][j]= array[i][j] + Math.max(dp_array[i][j+1],dp_array[i-1][j+1]);
                } else // except the rest condition
                {
                    dp_array[i][j] = array[i][j] + Math.max(dp_array[i][j+1],Math.max(dp_array[i+1][j+1],dp_array[i-1][j+1]));
                }
            }
        }
        int max = dp_array[0][0];
        for (int i = 1; i <dp_array.length ; i++) {
            if(dp_array[i][0] > max)
                max = dp_array[i][0];
        }
        System.out.println(max);
    }
}
