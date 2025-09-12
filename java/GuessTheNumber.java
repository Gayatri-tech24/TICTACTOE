//GUESS THE NUMBER
/* CREATE A CLASS GAME WHICH ALLOWS THE USER TO PLAY THE GUESS THE NUMBER GAME ONCE
 * COMPUTER GENERATES A RANDOM NUMBER AND STPRES IT IN A VARIABLE. 
 * THE USER TRIES TO GUESS THE NUMBER
 * IF THE GUESSED NUMBER IS SMALLER THEN IT WILL TELL THE GUESSED NUMBER IS SMALLER
 * VICE VERSA
 * NUMBER OF GUESSES IS THE SCORE
 * GAME SHOUDL HAVE THE FOLLOWING METHODS
 * 1. CONSTRUCTOR TO GENERATE RANDOM NUMBER
 * 2> TAKEuSERiNPUT()
 * 3. IScORRECTnUMBER()
 * getter and setter for number of guesses.
 * USE PROPERTIES SUCH AS NUM OF GUESSES,ETC.
 */
import java.util.Random;
import java.util.Scanner;
class generateRandomNumber
{
    int num;
    
    public void generateRandomNumber()
    {
        Random r= new Random();
        num= r.nextInt(101);
             
    }
}
class game extends generateRandomNumber
{
    int numOfGuesses=0;
    int userNum;
    public void takeUserInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("guess the number: ");
        userNum=sc.nextInt();
    }
    public boolean isCorrectNumber()
    {
        if(userNum==num)
        {
            System.out.println("Congratulations! you guessed it right");
            System.out.println("number of guesses: "+getGuesses());
            return true;
        }
        else if (userNum > num)
        {
            System.out.println("it is greater");
            setGuesses();
            
            return false;
           
        }
        else
        {
            System.out.println("it is smaller");
            setGuesses();
            
            return false;
            
        }
    }
    public int getGuesses()
    {
        return numOfGuesses;
    }
    public void setGuesses()
    {
        numOfGuesses++;
    }
}

public class GuessTheNumber
{
    public static void main(String[] args) {
        System.out.println("WELCOME TO GUESS THE NUMBER GAME!!");
        game g= new game();
        g.generateRandomNumber();
        boolean correct = false;
        while (correct!=true)
        {
            g.takeUserInput();
            correct=g.isCorrectNumber();
        }

    }
}
