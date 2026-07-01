package PIVOT_INDEX;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PivotIndex {
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
        int totalSum = 0;
        for(int i : a) {
            totalSum += i;
        }
        int flag = 0;
        int left = 0;
        for(int i=0;i<n;i++) {
            int right = totalSum-a[i]-left;
            if(left == right) {
                System.out.println("Pivot found at "+i);
                flag = 1;
                break;
            }
            left += a[i];
        }
        if(flag == 0) {
            System.out.println("Pivot doesn't exist");
        }
    }
}
