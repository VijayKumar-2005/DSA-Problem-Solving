package RANGE_SUM;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RangeSum {
    public static void main(String[] args) throws Exception{
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
        int[] prefixSum = new int[n];
        int ps = 0;
        for(int i=0;i<n;i++) {
            ps += a[i];
            prefixSum[i] = ps;
        }
        System.out.println("Enter left index: ");
        int l = Integer.parseInt(br.readLine());
        System.out.println("Enter left index: ");
        int r = Integer.parseInt(br.readLine());
        if(l==0) {
            System.out.print(prefixSum[r]);
        } else {
            System.out.print(prefixSum[r]-prefixSum[l-1]);
        }
    }    
}
