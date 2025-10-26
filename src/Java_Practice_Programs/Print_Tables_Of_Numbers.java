package Java_Practice_Programs;

import java.util.Scanner;

public class Print_Tables_Of_Numbers {

    public static void main(String[] args) {
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int n =scanner.nextInt();*/
        int n = 5;
        for (int i = 1; i <= 10; i++) {
         int   result = n*i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}