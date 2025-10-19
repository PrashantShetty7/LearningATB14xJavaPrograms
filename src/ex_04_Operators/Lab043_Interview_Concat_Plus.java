package ex_04_Operators;

import java.sql.SQLOutput;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String first_name = "Prashant";
        String last_name = "Shetty";

        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        // output : PrashantShetty1010

        System.out.println(a + b + first_name + last_name);
        // output : 20PrashantShetty

        // BODMAS - Bracket of Div, mul, add, sub
        System.out.println(first_name + last_name + (a + b));
        // output : PrashantShetty20
    }
}
