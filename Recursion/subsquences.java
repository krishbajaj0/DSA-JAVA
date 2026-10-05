import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subsquences {
    static  void printsub(int idx,int[]arr,int n,List<Integer> list){
        
        if(idx==n){
            System.out.println(list);
            return;
        }
        list.add(arr[idx]);
        printsub(idx+1, arr, n,list);
        list.remove(list.size()-1);
        printsub(idx+1, arr, n,list);
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        printsub(0,arr,n,list);
    }
}