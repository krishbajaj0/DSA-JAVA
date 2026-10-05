import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class combinationsumII {
    static void combsum(int[] arr,int idx,List<List<Integer>>ans,List<Integer> ds,int target){
        if(target==0){ ans.add(new ArrayList<> (ds)); return ;}

        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            ds.add(arr[i]);
            combsum(arr,i+1,ans,ds,target-arr[i]);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int[] candidates={10,1,2,7,6,1,5};
    int target=8;
     List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);

        combsum(candidates,0,ans,new ArrayList<>(),target);
        System.out.println(ans);
}
}
