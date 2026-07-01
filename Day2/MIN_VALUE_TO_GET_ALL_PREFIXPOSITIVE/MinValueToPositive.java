package MIN_VALUE_TO_GET_ALL_PREFIXPOSITIVE;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MinValueToPositive {
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
        int minval = a[0];
        int prefix = a[0];
        for(int i=1;i<n;i++) {
            prefix += a[i];
            minval = Math.min(minval, prefix);
        }
        System.out.println((minval*-1)+1);
    }
}
