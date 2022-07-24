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
        return 0;
    }
}
