import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int N = scanner.nextInt();
        System.out.println(N);
        scanner.close();
	}
}