import java.util.*;

public class leepYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean  z = (year % 400) == 0;
        
        if(x && (y || z)) {
            System.out.println(year + " is leep year.");
        } else {
            System.out.println(year + " is not Leep year.");
        }

        //Approach 2 using ternary 
        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "Leap Year" : "Not Leap";
        System.out.println(result);
    }
}
