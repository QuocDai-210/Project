package TestJava;

import java.util.Scanner;

public class testOOP {

    public static String noiChuoi (String s1, String s2, int order)
    {
        String s = new String();
        if (order == 0) s = s1 + s2;
        if (order == 1) s = s2 + s1;
        return s;
    }
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(n);
        String str1 = new String();
        String str2 = new String();
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        //int n = sc.nextInt();
        System.out.println(noiChuoi(str1,str2,n));
        sc.close();
    }

}
