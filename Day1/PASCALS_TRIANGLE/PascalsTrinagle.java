package PASCALS_TRIANGLE;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PascalsTrinagle {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter n:");
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            for(int j=0;j<=n-i-1;j++) {
                System.out.print(" ");
            }
            int val = 1;
            for(int j=0;j<=i;j++) {
                System.out.print(val + " ");
                val *= (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}