import java.util.Scanner;

public class stringpalindrome{

    static  boolean checkpal(int i,String name){
        if( i>=name.length()/2) return true;
        if(name.charAt(i)!=name.charAt(name.length()-i-1)) return  false;
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        System.out.print(checkpal(0,name));
    }
}