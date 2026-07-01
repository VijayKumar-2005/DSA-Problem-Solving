package SUM_OF_ALL_LENGTHSUBARRAY;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SumOfAllLengthSubarray {
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
        int[] prefix = new int[n+1];
        for(int i=1;i<n+1;i++) {
            prefix[i] = prefix[i-1]+a[i-1];
        }
        int sum = 0;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if((j-i+1)%2!=0) {
                    sum += prefix[j+1]-prefix[i];
                }
            }
        }
        System.out.println(sum);
    }
}
