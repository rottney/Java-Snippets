/*
  We define the following:
    A subarray of an n-element array is an array composed from a contiguous block of the original array's elements.
    For example, if A = [1, 2, 3], then the subarrays are [1], [2], [3], [1, 2], [2, 3], and [1, 2, 3].
    Something like [1, 3] would not be a subarray as it's not a contiguous subsection of the original array.
    The sum of an array is the total sum of its elements.
    An array's sum is negative if the total sum of its elements is negative.
    An array's sum is positive if the total sum of its elements is positive.
    Given an array of n integers, find and print its number of negative subarrays on a new line.

  Input Format
    The first line contains a single integer, n, denoting the length of array A. 
    The second line contains n space-separated integers describing each respective element, A[i], in array A.

  Constraints
    1 <= n <= 100
    -10^4 <= A[i] <= 10^4
  
  Output Format
    Print the number of subarrays of A having negative sums.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import sun.tools.jar.resources.jar_sv;

public class Solution {
    
    public static void main(String[] args) {
        int[] arr = new int[100];
        int n;
        int temp = 0;
        int count = 0;

        // IO
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        // Logic
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            if (temp < 0) {
                count++;
            }
            for (int j = i+1; j < n; j++) {
                temp += arr[j];
                if (temp < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
