import java.io.*; 
  
class GFG { 
   
    static boolean isSubArray(int A[], int B[], int n, int m) 
    {  
        int i = 0, j = 0; 
   
        while (i < n && j < m) { 
   
            if (A[i] == B[j]) { 
                i++; 
                j++; 
  
   
                if (j == m) 
                    return true; 
            } 
  
            else { 
                i++; 
                j = 0; 
            } 
        } 
  
        return false; 
    } 
   
  
    public static void main(String[] args) 
    { 
        int n = 7; 
        int m = 4; 
  
        int A[] = { 2, 3, 0, 5, 1, 1, 2 }; 
        int B[] = { 3, 0, 5, 1 }; 
  
        if (isSubArray(A, B, n, m)) 
            System.out.println("YES\n"); 
        else
            System.out.println("NO\n"); 
    } 
} 
 
