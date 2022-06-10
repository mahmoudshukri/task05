package Sample;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        String s1;
        String s2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter first name:..");
        s1 = scanner.next();
        System.out.println("Please Enter second name:..");
        s2 = scanner.next();
System.out.println("Result Equal:"+s1.equals(s2));
        System.out.println("Result Ignore case :"+s1.equalsIgnoreCase(s2));









    }
}
