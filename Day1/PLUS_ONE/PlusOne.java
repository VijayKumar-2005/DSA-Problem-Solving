package PLUS_ONE;
import java.io.InputStreamReader;
import java.io.BufferedReader;      
public class PlusOne {
    public static int[] ps(int a[], int i, int c) {
        if(i >= 0) {
            a[i] += c;
            if(a[i] > 9) {
                c = a[i]/10;
                a[i] = a[i]%10;
                return ps(a, i-1, c);
            }
            return a;
        } 
        int tmp[] = new int[a.length+1];
        tmp[0] = c;
        for(int j=1;j<tmp.length;j++) {
            tmp[j] = a[j-1];
        }
        return tmp;
    }
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
        int[] r = ps(a, n-1, 1);
        System.out.print("[ ");
        for(int i : r) {
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}
