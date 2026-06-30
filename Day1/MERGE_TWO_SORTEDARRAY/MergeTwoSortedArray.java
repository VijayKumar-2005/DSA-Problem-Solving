package MERGE_TWO_SORTEDARRAY;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class MergeTwoSortedArray {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter n1:");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println("Enter n1 number of Elements:");
        String[] s1 = br.readLine().split(" ");
        int[] a1 = new int[n1];
        for(int i=0;i<n1;i++) {
            a1[i] = Integer.parseInt(s1[i]);
        }
        System.out.println("Enter n2:");
        int n2 = Integer.parseInt(br.readLine());
        System.out.println("Enter n2 number of Elements:");
        String[] s2 = br.readLine().split(" ");
        int[] a2 = new int[n2];
        for(int i=0;i<n2;i++) {
            a2[i] = Integer.parseInt(s2[i]);
        }
        int[] r = new int[a1.length+a2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n1 && j < n2) {
            if(a1[i] < a2[j]) {
                r[k++] = a1[i++];
            } else {
                r[k++] = a2[j++];
            }
        }
        while(i < n1) {
            r[k++] = a1[i++];
        }
        while(j < n2) {
            r[k++] = a2[j++];
        }
        System.out.print("[ ");
        for(int q : r) {
            System.out.print(q+" ");
        }
        System.out.print("]\n");
    }
}
