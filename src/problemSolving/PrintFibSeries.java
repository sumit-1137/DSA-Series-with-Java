package problemSolving;

import java.util.Scanner;

class FibNumber {
    public void printSeries(int num) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci series up to " + num + ": ");

        // print first two terms
        if (num >= 0) System.out.print(firstTerm + " ");
        if (num >= 1) System.out.print(secondTerm + " ");

        // generate remaining terms
        for (int i = 2; i <= num; i++) {
            int thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}

public class PrintFibSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibNumber fib1 = new FibNumber();

        System.out.print("Enter the number up to which you want Fibonacci series: ");
        int x = sc.nextInt();

        fib1.printSeries(x);
    }
}
