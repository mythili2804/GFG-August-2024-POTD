//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends
// User function Template for Java

/*class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
       int[] arr=new int[arr1.length+arr2.length];
     int i=0;
     int j=0;
     int k=0;
     while(i<arr1.length && j<arr2.length){
         if(arr[i]<=arr[j]){
            arr[k]=arr[i];
            k++;
            i++;
            
         }
         else if(arr1[i]>arr2[j]){
             arr[k]=arr[j];
             k++;
             j++;
         }
     }
     int p=0;
     int q=arr.length-1;
     int mid=(p+q)/2;
    if(arr.length%2==0){
        return arr[mid]+ arr[mid-1];
    }
    return arr[mid];
        
    }
}
*/

class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        
        // Copy elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        
        // Copy elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        
        // Sort the combined array
        Arrays.sort(arr);
        
        int length = arr.length;
        if (length % 2 == 0) {
            // Even length: sum of two middle elements
            return arr[length / 2 - 1] + arr[length / 2];
        } else {
            // Odd length: sum of the middle element with itself
            return arr[length / 2] * 2;
        }
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.SumofMiddleElements(arr, brr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends