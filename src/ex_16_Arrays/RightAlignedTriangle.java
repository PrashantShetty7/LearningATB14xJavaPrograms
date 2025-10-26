package ex_16_Arrays;

import java.util.Scanner;

public class RightAlignedTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n-1 ;j++)
            {
                System.out.print("-");
            }
            for(int k=0 ; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
