package CONTAINS_DUPLICATES;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
public class ContainDuplicates {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter n:");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter n number of Elements:");
        String[] s = br.readLine().split(" ");
        HashMap<Integer, Integer> hm = new HashMap<>();
        int f = 0;
        for(int i=0;i<n;i++) {
            int tmp = Integer.parseInt(s[i]);
            hm.put(tmp, hm.getOrDefault(tmp, 0) + 1);
            if(hm.get(tmp) > 1) {
                System.out.println("Contains Duplicates");
                f = 1;
                break;
            }
        }
        if(f == 0) {
            System.out.println("Doesn't contains Duplicates");
        }        
    }    
}
