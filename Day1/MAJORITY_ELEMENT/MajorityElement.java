package MAJORITY_ELEMENT;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MajorityElement {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter n:");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter n1 number of Elements:");
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int c = a[0];
        int f = 1;
        for(int i=1;i<n;i++) {
            if(f == 0) {
                c = a[i];
                f = 1;
            } else if(c == a[i]) {
                f++;
            } else {
                f--;
            }
        }
        System.out.println(c);
    }
}
