//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] inp = read.readLine().split(" ");
            int A = Integer.parseInt(inp[0]);
            int B = Integer.parseInt(inp[1]);
            Solution ob = new Solution();
            System.out.println(ob.addition(A, B));
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int addition(int a, int b) {
        // code here
        int sum;
        sum = a+b;
        return sum;
    }
    
}