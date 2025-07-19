
//tic tac toe game
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }
        int count=0;
        while(true){
            System.out.println("  0 1 2");
            for(int i=0;i<3;i++){
                System.out.print(i+" ");
                for(int j=0;j<3;j++){
                    System.out.print(board[i][j]);
                    if(j<2){
                        System.out.print("|");
                    }
                }
                System.out.println();
                if(i<2){
                    System.out.println("  -----");
                }
            }
            System.out.println("Enter the row and column number: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(count%2==0){
                board[row][col]='X';
            }
            else{
                board[row][col]='O';
            }
            count++;
            if(count>=5){
                if(board[0][0]==board[0][1] && board[0][1]==board[0][2] && board[0][0]!=' '){
                    System.out.println("Player "+board[0][0]+" wins");
                    break;
                }
                else if(board[1][0]==board[1][1] && board[1][1]==board[1][2] && board[1][0]!=' '){
                    System.out.println("Player "+board[1][0]+" wins");
                    break;
                }
                else if(board[2][0]==board[2][1] && board[2][1]==board[2][2] && board[2][0]
                !=' '){
                    System.out.println("Player "+board[2][0]+" wins");
                    break;
                }
                else if(board[0][0]==board[1][0] && board[1][0]==board[2][0] && board[0][0]!=' '){
                    System.out.println("Player "+board[0][0]+" wins");
                    break;
                }
                else if(board[0][1]==board[1][1] && board[1][1]==board[2][1] && board[0][1]!=' '){
                    System.out.println("Player "+board[0][1]+" wins");
                    break;
                }
                else if(board[0][2]==board[1][2] && board[1][2]==board[2][2] && board[0][2]!=' '){
                    System.out.println("Player "+board[0][2]+" wins");
                    break;
                }
                else if(board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[0][0]!=' '){
                    System.out.println("Player "+board[0][0]+" wins");
                    break;
                }
                else if(board[0][2]==board[1][1] && board[1][1]==board[2][0] && board[0][2]!=' '){
                    System.out.println("Player "+board[0][2]+" wins");
                    break;
                }
                else if(count==9){
                    System.out.println("It's a draw");
                    break;
                }
            }
        }   
    }
}