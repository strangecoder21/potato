import java.io.*;
import java.util.*;
 
public class GFG {
 
    // Returns length of LCS for X[0..m-1], Y[0..n-1]
    int lcs(String X, String Y, int m, int n)
    {
        if (m == 0 || n == 0)
            return 0;
        if (X.charAt(m - 1) == Y.charAt(n - 1))
            return 1 + lcs(X, Y, m - 1, n - 1);
        else
            return max(lcs(X, Y, m, n - 1),lcs(X, Y, m - 1, n));
    }
 
    // Utility function to get max of 2 integers
    int max(int a, int b) { return (a > b) ? a : b; }
 
    // Driver code
    public static void main(String[] args)
    {
        GFG lcs = new GFG();
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        int m = S1.length();
        int n = S2.length();
 
        System.out.println( lcs.lcs(S1, S2, m, n));
    }
}