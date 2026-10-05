import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class combinationsumI {
    static void findcomb(int idx,int[]arr, int target,List<List<Integer>>ans,List<Integer>ds){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        } 
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            findcomb(idx,arr,target-arr[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
        findcomb(idx+1,arr,target,ans,ds);
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> ans = new ArrayList<>();
        findcomb(0,arr,target,ans,new ArrayList<>());
        System.out.print(ans); 
    }
}