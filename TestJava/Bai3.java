package TestJava;

import java.util.Scanner;

public class Bai3{  
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for (int k = 1 ; k <= count ; k++)
        {
            for (int i = 1 ; i < count - k + 1 ; i++)
                System.out.print(" ");
            for (int j = 1 ; j <= k ; j++)
                System.out.print("* ");
            System.out.println();
        }
        scan.close();
    }
}