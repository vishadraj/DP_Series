/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 24-07-2022
 */

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int totalPathCount = countPath(n, new int[n+1]);
        System.out.println(totalPathCount);
    }

    public static int countPath(int n, int [] array){
        if(n==0)
            return 1;
        else if(n <0)
            return 0;

        if(array[n] > 0 ) {
            return array[n];
        }
        int num1 = countPath(n-1,array);
        int num2 = countPath(n-2, array);
        int num3 = countPath(n-3, array);
        int totalPath = num1+num2+num3;
        array[n]= totalPath;
        return totalPath;
    }
}
