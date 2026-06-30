package BINARY_SEARCH;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class BinarySearch {
    public static int Bs(int a[], int k, int l, int r) {
        if(l > r) {
            return -1;
        }
        int m = l+((r-l) / 2);
        if(a[m] < k) {
            return Bs(a,k,m+1,r);
        } else if(a[m] > k) {
            return Bs(a,k,l,m-1);
        }
        return m;
    }
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
        System.out.println("Enter k:");
        int k = Integer.parseInt(br.readLine());
        System.out.print("Ans: "+Bs(a,k,0,n-1));
    }
}
