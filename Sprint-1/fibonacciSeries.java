import java.util.*;
public class fibonacciSeries {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        //input number of terms 
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        //first two terms
        int a = 0, b = 1;

        System.out.print("Fibonacci Series :");

        //if n >= 1 then print first two terms
        if(n >= 1) System.out.print(a + " ");
        if(n >= 2) System.out.print(b + " ");

        //loop for next term
        for(int i = 3; i<= n; i++) {
            int next = a+b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        sc.close();
    }
}
