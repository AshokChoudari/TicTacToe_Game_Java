import java.util.*;
public class TicTac{
   static ArrayList <Integer> humNum=new ArrayList<>();
   static ArrayList <Integer> cpuNum=new ArrayList<>();
    public static void main(String[] args) {
        char board[][]={{' ','|',' ','|',' '},
                        {'-','+','-','+','-'},
                        {' ','|',' ','|',' '},
                        {'-','+','-','+','-'},
                        {' ','|',' ','|',' '},};
    
        System.out.println("WelCome to TicTac Game....:)");                
        System.out.println("Enter position (1-9)||");
        display(board);
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        String winner="";
        while(true){
            System.out.println("Enter position (1-9)||");
            int humLoc=sc.nextInt();
            while(cpuNum.contains(humLoc) || humNum.contains(humLoc)){
                System.out.println("Position Already Exist! Enter Correct Position...");
                humLoc=sc.nextInt();
            }
            enter(board, humLoc,"Human");
            
            winner=isWin();
            if(winner.length()!=0){
                display(board);
                System.out.println(winner);
                break;
            }

            int cpuPos=ran.nextInt(9)+1;
            while(cpuNum.contains(cpuPos) || humNum.contains(cpuPos)){
               // System.out.println("Position Already Exist! Enter Correct Position...");
                cpuPos=ran.nextInt(9)+1;
            }
            enter(board, cpuPos, "cpu");
            
            display(board);
            winner=isWin();
            if(winner.length()!=0){
                display(board);
                System.out.println(winner);
                break;
            }
            
        }
        
    }
    public static void display(char[][] board){
        for(char[] row:board){
            for(char ch:row){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    } 
    public static void enter(char [][] board,int pos,String user){

        char symbol=' ';
        if(user.equals("Human")){
            symbol='X';
            humNum.add(pos);
        }else if(user.equals("cpu")){
            symbol='O';
            cpuNum.add(pos);
        }
        switch(pos){
            case 1:
                board[0][0]=symbol;
                break;
            case 2:
                board[0][2]=symbol;
                break;
            case 3:
                board[0][4]=symbol;
                break;   
            case 4:
                board[2][0]=symbol;
                break;
            case 5:
                board[2][2]=symbol;
                break;
            case 6:
                board[2][4]=symbol;
                break;
            case 7:
                board[4][0]=symbol;
                break;
            case 8:
                board[4][2]=symbol;
                break;
            case 9:
                board[4][4]=symbol;
                break;
            default:
                System.out.println("Enter valid Number :)");
                break;
                
        }
    }
    public static String isWin(){
        List topRow=Arrays.asList(1,2,3);
        List midRow=Arrays.asList(4,5,6);
        List botmRow=Arrays.asList(7,8,9);
        List leftCol=Arrays.asList(1,4,7);
        List midCol=Arrays.asList(2,5,8);
        List rightCol=Arrays.asList(3,6,9);
        List cross1=Arrays.asList(1,5,9);
        List cross2=Arrays.asList(3,5,7);

        List<List> win=new ArrayList<List>();
        win.add(topRow);
        win.add(midRow);
        win.add(botmRow);
        win.add(leftCol);
        win.add(midCol);
        win.add(rightCol);
        win.add(cross1);
        win.add(cross2);
        for(List l:win){
            if(humNum.containsAll(l)){
                return "You won the Match :)";
            }
            else if(cpuNum.containsAll(l)){
                return "CPU won the Match :(";
            }
            else if(humNum.size()+cpuNum.size()==9){
                return "Draw ...:!";
            }
        }
        return "";
    }

}