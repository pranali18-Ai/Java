//print Star Pattern
/*

 *
 **
 ***
 ****

 */

import java.util.Scanner;
public class Star_pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Star pattern of lines : ");
        int n = sc.nextInt();
        for(int line = 1; line<=n; line++){         //outer loop for lines
            for(int star = 1; star<=line; star++){   //outer loop for star
                System.out.print("*"); //ln will not apply because it will print star in next 
            }
            System.out.println(); //next line 
        }
    }
}