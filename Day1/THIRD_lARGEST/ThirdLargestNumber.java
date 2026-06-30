package THIRD_lARGEST;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ThirdLargestNumber {
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
        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        int tl = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if (fl < a[i]) {
                tl = sl;
                sl = fl;
                fl = a[i];
            } else if (fl != a[i] && sl < a[i]) {
                tl = sl;
                sl = a[i];
            } else if(tl<a[i] && sl!=a[i] && fl!=a[i]){
                tl = a[i];
            }
        }
        System.out.println(tl);
    }
}
