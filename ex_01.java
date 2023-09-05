import java.util.*;
import java.lang.*;
import java.io.*;

public class ex_01 {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X:");
        int X = scanner.nextInt();
        System.out.println("Enter Y:");
        int Y = scanner.nextInt();
        System.out.println(X*Y);
        scanner.close();
	}
}
    
