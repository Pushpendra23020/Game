
import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(100);
        System.out.println(x);
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = num.nextInt();
        int  count=0;
        while(number!=x){
            if(number>x){
                System.out.println("The number is too high");
            }
            else{
                System.out.println("The number is too low");
            }
            System.out.println("Enter your number: ");
            number=num.nextInt();
            count++;
        }  
        System.out.println(""+count+" attempts");
    }
}