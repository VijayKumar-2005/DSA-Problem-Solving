package RUNNING_SUM;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class RunningSum {
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
        int currentSum = a[0];
        for(int i=1;i<n;i++) {
            currentSum += a[i];
            a[i] = currentSum;
        }
        System.out.print("[ ");
        for(int i : a) {
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}
