package SUMMARY_RANGES;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class SummaryRanges {
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
        List<String> r = new ArrayList<>();
        int i = 0;
        while (i < a.length) {
            int start = a[i];
            while (i + 1 < a.length && a[i + 1] == a[i] + 1) {
                i++;
            }
            int end = a[i];
            if (start == end) {
                r.add(String.valueOf(start));
            } else {
                r.add(start + "->" + end);
            }
            i++;
        }
        System.out.println(r);
    }
}
