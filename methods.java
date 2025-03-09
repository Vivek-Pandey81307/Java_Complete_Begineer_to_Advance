import java.util.Scanner;
public class methods{
    public static void main(String[] args){
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int ans = digitSum(val);
        System.out.println("Digit Sum = "+ ans);


    }
    static int digitSum(int arg){
        int ans =0;
        String s = String.valueOf(arg);
        for(int i = 0;i<s.length();i++){
            ans+= s.charAt(i) - '0';
        }return ans;
    }
}