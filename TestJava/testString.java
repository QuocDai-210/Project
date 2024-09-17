package TestJava;

import java.util.Scanner;

public class testString {

    public static String InputString() 
    {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static String noiChuoi(String s1, String s2, int order) 
    {
        String s = new String();
        if (order == 0)
            s = s1 + s2;
        if (order == 1)
            s = s2 + s1;
        return s;
    }

    public static String getLastWord(String s) 
    {
        String[] word = s.split(" ");
        return word[word.length - 1];
    }

    public static void main(String agrs[]) 
    {

    }
}
