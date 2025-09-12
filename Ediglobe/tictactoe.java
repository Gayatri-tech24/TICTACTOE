package Ediglobe;


import java.util.Scanner;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
class GAME 
{   public static int counter=0;
     public static JButton[][] button= new JButton[3][3];
     
     static
     {
       int num=1;
    for ( int r=0;r<3;r++)
    {
        for (int c=0;c<3;c++)
        {
           button[r][c]= new JButton(" ");
        }
    }
}
    public static boolean value=true;
    public void startGame()
    {   Board ob= new Board();
        Scanner sc= new Scanner(System.in);
        do
        {
        
        System.out.println("Enter a number (1-9): ");
        int mark= sc.nextInt();
        
        switch (mark) {
            case 1:
                ob.isCellEmpty(0,0);
                break;
            case 2:
            ob.isCellEmpty(0,1);
                break;
            case 3:
                ob.isCellEmpty(0,2);
                break;
            case 4:
                ob.isCellEmpty(1,0);
                break;
            case 5:
                ob.isCellEmpty(1,1);
                break;
            case 6:
                ob.isCellEmpty(1,2);
                break;
            case 7:
                ob.isCellEmpty(2,0);
                break;
            case 8:
                ob.isCellEmpty(2,1);
                break;
            case 9:
                ob.isCellEmpty(2,2);
                break;
        
            default:
                System.out.println("Enter a valid number!!!");
                continue;
                
        }
    }
    while (checkGameStatus().equals("yes"));
       
    }
    public boolean playTurn(boolean value)
    {
        if ( counter%2==0)
        {
            counter++;
            value=true;
            return value;
        }
        else
        {
             counter ++;
             value=false;
             return value;
        }

    }
    public String checkGameStatus()
    {
        for (int i=0;i<3;i++)
        {
            if (!button[i][0].getText().equals(" ") && button[i][0].getText().equals(button[i][1].getText()) && button[i][1].getText().equals(button[i][2].getText()) )
            {
                System.out.println(button[i][0].getText()+" Wins!!");
               return "no";
            }
        }
         for (int i=0;i<3;i++)
        {
            if (!button[0][i].getText().equals(" ") && button[0][i].getText().equals(button[1][i].getText()) && button[1][i].getText().equals(button[2][i].getText()) )
            {
                System.out.println(button[0][i].getText()+" Wins!!");
                return "no";
            }
        }
        if (!button[0][0].getText().equals(" ") && button[0][0].getText().equals(button[1][1].getText()) && button[1][1].getText().equals(button[2][2].getText()) )
            {
                System.out.println(button[0][0].getText()+" Wins!!");
                return "no";
            }
        if (!button[0][2].getText().equals(" ") && button[0][2].getText().equals(button[1][1].getText()) && button[1][1].getText().equals(button[2][0].getText()) )
            {
                System.out.println(button[0][2].getText()+" Wins!!");
                return "no";
            }
       
        boolean bool= true;
        for ( int r=0;r<3;r++)
        {
            for ( int j=0;j<3;j++)
            {
                if( button[r][j].getText().equals(" "))
                {
                    bool=false;
                    break;
                }
            }

        }
        if (bool)
        {
            System.out.println("DRAW!!!");
            return "no";
        }
        else
        {
            return "yes";
        }

    }
}
class Board extends GAME
{  
    public void displayBoard()
    {
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,400);
       frame.setLocationRelativeTo(null);
       JPanel panel = new JPanel();
       panel.setLayout(new GridLayout(3,3));
       panel.setBackground(new Color(253,240,213));
       for (int r=0; r<3;r++)
       {
        for ( int c=0;c<3;c++)
        {
            
            button[r][c].setFont(new Font("Comic Sans MS",Font.BOLD,60));
            button[r][c].setFocusPainted(false);
            button[r][c].setBackground(Color.WHITE);
            button[r][c].setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
          
            panel.add(button[r][c]);
        }
    JLabel status = new JLabel("TIC TAC TOE", SwingConstants.CENTER);
    status.setFont(new Font("Arial", Font.BOLD, 20));
    status.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

    frame.setLayout(new BorderLayout());
    frame.add(status, BorderLayout.NORTH);
    frame.add(panel, BorderLayout.CENTER);

    frame.setVisible(true);}
       
       
    }
    public void markCell(int row, int col,boolean value)
    {
        Player os= new Player();
        button[row][col].setText(os.getSymbol(playTurn(value)));
        
        checkGameStatus();

    }
    public void isCellEmpty(int row,int col)
    {
        if ( !button[row][col].getText().equals(" "))
        {
            System.out.println("Sorry! occupied!!!");
            System.out.println("try Again!!");
            
        }
        else
        {   
            markCell(row, col,value);
        }

    }
}
class Player{
    public String getSymbol(boolean value)
    {
        if (value)
        {
            
            return "X";
        }
        else
        {
            
            return "O";
        }
    }
}
public class tictactoe
{
    public static void main(String[] args) {
        System.out.println("WELCOME TO TIC TAC TOE GAME !!!!");
        GAME ob= new GAME();
        Board on= new Board();
        on.displayBoard();
        ob.startGame();
        
    }
}


