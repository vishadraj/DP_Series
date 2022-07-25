/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 25-07-2022
 */

import java.util.Scanner;

public class ClimbingStairsWIthMinimumMoves {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=input.nextInt();
        }
        // Creat a DP array of Size n+1
        Integer [] dp = new Integer[n+1];
        dp[n]=0;
        for(int i=n-1; i>=0; i--){
            if(arr[i]>0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i+j < dp.length; j++) {
                    if(dp[i+j] != null){
                        min = Math.min(min, dp[i+j]);
                    }
                }
                if(min!= Integer.MAX_VALUE)
                    dp[i]= min+1;

            }
        }
        System.out.println(dp[0]);

    }

}
