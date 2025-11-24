import java.util.*;
public class nnp {
    public int remdu(int[] nums) {
        if(nums.length ==0) return 0;
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[j]!= nums[i]){
                i++;
                nums[i] = nums[j];

            }
        }
        return i+1;
    }
public static void main(String[] args){
    int[] nums= {0,0,1,1,1,2,2,3,3,4};
    nnp t= new nnp();
    int k= t.remdu(nums);
    System.out.println("unique count = " + k);
    System.out.println("array after removing: ");
    for(int x=0; x<k;x++){
        System.err.println(nums[x]+ "");
    }


}
    

}

