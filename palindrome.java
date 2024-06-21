import java.util.Scanner;
public class palindrome {
    public boolean isPalindrome(int x) {
        int temp = x;
        int sum=0;
        while (x>0) {
            int rem = (x % 10);
            sum=(sum*10)+rem;
            x = x / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=s.nextInt();
        palindrome p=new palindrome();
        System.out.println(p.isPalindrome(x));
    }
}
