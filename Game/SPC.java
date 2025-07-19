import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(3);
       // int lowerbound=0;
        //int upperbound=3;
        System.out.println("0= Stone\n"+ " 1= Paper\n"+ " 2= Scissors\n"+ " 3= Exit\n");
        System.out.print("Enter your choice: ");  
        int choice = s.nextInt();
        while(true){
        x = rand.nextInt(3);
       // System.out.println(x);
        if(x==0){
            if(choice==0){
                System.out.println("It's a draw");
            }
            else if(choice==1){
                System.out.println("You win");
            }
            else if(choice==2){
                System.out.println("You lose");
            }
            else if(choice==3)
           {
               break;
          }
            else{
                System.out.println("Invalid choice");
            }
        }
        else if(x==1){
            if(choice==0){
                System.out.println("You lose");
            }
            else if(choice==1){
                System.out.println("It's a draw");
            }
            else if(choice==2){
                System.out.println("You win");
            }
            else if(choice==3)
           {
               break;
          }
            else{
                System.out.println("Invalid choice");
            }
        }
        else if(x==2){
            if(choice==0){
                System.out.println("You win");
            }
            else if(choice==1){
                System.out.println("You lose");
            }
            else if(choice==2){
                System.out.println("It's a draw");
            }
            else if(choice==3)
           {
               break;
          }
            else{
                System.out.println("Invalid choice");
            }
        }
        System.out.print("Enter your choice: ");  
        choice = s.nextInt();
       }
     }
}