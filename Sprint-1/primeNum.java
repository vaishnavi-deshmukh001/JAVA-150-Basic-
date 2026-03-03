import java.util.*;
public class primeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        boolean isPrime = true;
        //Step 1: Numbers less than 2 are not prime.
        if(num < 2){
            isPrime = false;
        } else {
            // Step 2: Check divisibility from 2 to ssqrt(num)
            for (int i = 2; i*i < num ; i++){
                if(num % i == 0){
                    isPrime = false;// found divisor
                    break; // no neet to check further
                }
            }
        }
        //step 3: print result
        if(isPrime){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }
        sc.close();
    }
}
