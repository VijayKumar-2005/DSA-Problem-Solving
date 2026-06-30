package BUY_AND_SELLSTOCK;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BuyandSellStock {
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
        int StockMin = a[0];
        int maxDiff = 0;
        for(int i=0;i<n;i++) {
            if(a[i] < StockMin) {
                StockMin = a[i];
            }
            int tmp = a[i]-StockMin;
            if(tmp > maxDiff) {
                maxDiff = tmp;
            }
        }
        System.out.println(maxDiff);
    }
}
