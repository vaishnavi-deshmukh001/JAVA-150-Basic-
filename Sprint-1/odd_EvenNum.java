import java.util.*;
public class odd_EvenNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
    //Approach 1 module operator
        if(num % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("ODD number");
        }

    //Approach 2 using bitwise AND operator
        if((num & 1) == 0) System.out.print("Even");
        else { System.out.print("odd");}

    //Approach 3 Using ternory operatot
        String result = ((num % 2) == 0) ? "Even" : "odd";
        System.out.println(result);

    //Approach 4 using switch case
    switch (num % 2) {
        case 0:
            System.out.println("even");
            break;
        case 1:
            System.out.println("odd");
            break;
    
        default:
            break;
    }

    }
}