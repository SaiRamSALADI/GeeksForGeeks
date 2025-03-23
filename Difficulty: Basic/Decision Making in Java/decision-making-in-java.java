//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int m;
            m = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            String res = obj.compareNM(n, m);
            
            System.out.println(res);
            
        
System.out.println("~");
}
    }
}


// } Driver Code Ends
class Solution {
    public static String compareNM(int n, int m) {
        if (n < m) {
            return "lesser";
        } else if (n == m) {
            return "equal";
        } else {
            return "greater";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter second number (m): ");
        int m = scanner.nextInt();

        System.out.println(compareNM(n, m));

        scanner.close();
    }
}



//{ Driver Code Starts.

// } Driver Code Ends