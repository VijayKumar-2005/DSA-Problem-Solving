package PARITY_SORT;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ParitySort {
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
        int l = 0;
        int r = n-1;
        while(l < r) {
            if(a[l]%2==0) {
                l++;
            }else if (a[r]%2!=0) {
                r--;
            } else {
                int tmp = a[l];
                a[l] = a[r];
                a[r] = tmp;
                l++;
                r--;
            }
        }
        System.out.print("[ ");
        for(int i : a) {
            System.out.print(i+" ");
        }
        System.out.print("]\n");
    }   
}
