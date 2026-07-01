package MAXIMUM_PRODUCT;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MaximumProductArray {
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
        int maxP = a[0];
        int minP = a[0];
        int ans = a[0];
        for(int i=1;i<n;i++) {
            if(a[i] < 0) {
                int tmp = maxP;
                maxP = minP;
                minP = tmp;
            }
            maxP = Math.max(a[i], maxP*a[i]);
            minP = Math.min(a[i], minP*a[i]);
            ans = Math.max(ans, maxP);
        }
        System.out.print(ans);
    }
}
