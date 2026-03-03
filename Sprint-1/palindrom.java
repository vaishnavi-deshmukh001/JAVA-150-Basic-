import java.util.*;
public class palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String or Number :");
        String input = sc.nextLine();
        boolean isPalindrom = true;
        int i = 0, j = input.length()-1;
        while(i<j){
            if(input.charAt(i) != input.charAt(j)){
                isPalindrom = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrom){
            System.out.println(input + " is Palindrom.");
        } else {
            System.out.println(input + " is not Palindrom.");
        }
    }
}