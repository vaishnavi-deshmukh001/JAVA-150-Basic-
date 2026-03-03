import java.util.*;
//amstrong number/ narcissistic number/ pluperfect digital invariant
public class armstrongNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");                         
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        //Step 1 : count digits (convert to String to count)
        int digits = String.valueOf(num).length();

        //Step 2 : Extract each digit and calculate power
        while(num > 0) {
            int digit = num % 10; //get last digit
            sum += Math.pow(digit, digits);//digit^digits
            num /= 10; //remove last digit 
        }

        //Step 3: Compare result 
        if(sum == original){
            System.out.println(original + " is an Armstrong number. ");
        } else {
            System.out.println(original + " is NOT an Armstrong number. ");
        }
        sc.close();

    }
}
