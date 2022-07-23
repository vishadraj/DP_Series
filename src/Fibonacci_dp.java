/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 23-07-2022
 */

import java.util.Scanner;

public class Fibonacci_dp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fibonacci_no = Fibonacci(number, new int[number+1]);
        System.out.println(fibonacci_no);
    }
    public static int Fibonacci(int n, int[] dp_array){
        if(n==0 || n==1) return n;
        if(dp_array[n] != 0) return dp_array[n];
        int fib = Fibonacci(n-1,dp_array) + Fibonacci(n-2,dp_array);
        return 0;
    }

}
