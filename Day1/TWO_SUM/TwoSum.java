package TWO_SUM;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class TwoSum {
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
        System.out.println("Enter k:");
        int k = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();
        int flag = 0;
        for(int i=0;i<n;i++) {
            int tmp = k-a[i];
            if(hm.containsKey(tmp)) {
                System.out.println("Pair Found at the index ["+(hm.get(tmp))+","+(i)+"]");
                flag = 1;
                break;
            }
            hm.put(a[i], i);
        }
        System.out.println(flag == 0 ? "No pair found" : "Pair found");
    }
}