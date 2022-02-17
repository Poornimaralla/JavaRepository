package casestudy;
import java.util.*;

public class Arm_strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number num to check arm strong : ");
        int number = sc.nextInt();

        int j = 0;
        int rem = 0;
        int temp = 0;
        j=number;
        while (j!= 0) {
            rem = j%10;
            temp = temp +(rem*rem*rem);
            j /=10;}

        if(temp==number){
            System.out.println(number+" is armstrong number");
        }else{
            System.out.println(number+"is not armstrong");
        }


    }}







