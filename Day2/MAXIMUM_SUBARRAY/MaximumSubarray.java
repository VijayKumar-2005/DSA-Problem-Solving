package MAXIMUM_SUBARRAY;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MaximumSubarray {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter n:");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter n number of Elements:");
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            currentSum = Math.max(a[i],currentSum + a[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println(currentSum);
    }
}