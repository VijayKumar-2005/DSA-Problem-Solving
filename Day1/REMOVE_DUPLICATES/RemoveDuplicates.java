package REMOVE_DUPLICATES;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class RemoveDuplicates{
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
        int i = 0;
        for(int j = 0;j < n;j++) {
            if(a[i] != a[j]) {
                a[++i] = a[j];
            }
        }
        System.out.print("[ ");
        for(int j=0;j<i+1;j++) {
            System.out.print(a[j]+" ");
        }
        System.out.print("]");
    }
}