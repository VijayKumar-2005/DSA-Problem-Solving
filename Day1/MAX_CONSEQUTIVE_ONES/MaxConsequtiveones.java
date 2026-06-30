package MAX_CONSEQUTIVE_ONES;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MaxConsequtiveones {
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
        int c = a[0];
        int f = 1;
        int mf = f;
        for(int i = 1;i<n;i++) {
            if(a[i]==c) {
                f++;
            } else {
                c = a[i];
                f = 1;
            }
            if(f > mf) {
                mf = f;
            }
        }
        System.out.println(mf);
    }
}
