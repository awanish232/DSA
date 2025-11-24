import java.util.*;
public class twp {
    public static String  twos(int n, int[] arr, int target) {
        Arrays.sort(arr);
        int left =0, right= n-1;
        while(left<right) {
            int sum = arr[left] + arr[right];
            if(sum==target)
                return "yes";
            else if (sum>target)
                right --;
            else left ++;}
        return "no";
        }
       


    

public static void main(String args[]){
    int n=5;
    int[] arr= {2, 6,5,8, 11};
    int target = 14;
    String ans = twos(n, arr, target);
    System.out.println("this is " + ans);
}
}
