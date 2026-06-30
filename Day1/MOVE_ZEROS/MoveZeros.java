package MOVE_ZEROS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MoveZeros {
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
        int j = -1;
        for(int i=0;i<n;i++) {
            if(a[i]!=0) {
                a[++j] = a[i];
            }
        }
        for(int i = j+1;i<n;i++) {
            a[i] = 0;
        }
        System.out.print("[ ");
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.print("]\n");
    }
}
