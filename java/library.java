/*
 * you have to implement a library using java class library
 * methods:
 * issueBook
 * returnBook
 * showAvailable books
 * addBook
 * properties:
 * array to store the available books
 * array to store the issued books
 * 
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class fake_library
{
    String[] books = new String[50];
    int count = 0;

    public void addBook(String bookName) {
        if (count < books.length) {
            books[count] = bookName;
            count++;
            System.out.println("Book added!");
            System.out.println("Total books: " + count);
        } else {
            System.out.println("No more space to add books!");
        }
    }
     public void removeBook(String bookName)
    {
        for (int i = 0; i < count; i++) 
        {
            if (books[i].equals(bookName))
             {
               
                for (int j = i; j < count - 1; j++)
                 {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null; 
                count--; 
                break;
            }
        }
    }
    public void showAvailableBooks()
    {
        System.out.println("number of available books: "+count);
        for ( int i=0;i<count;i++)
        {
            System.out.println(books[i]);
            System.out.println("\n");
        }
    }
}
class Record extends fake_library
{
    public void issueBook()
    {
        HashMap <String, List<String>> byWhom = new HashMap<>();   
             
        System.out.println("Enter your name: ");
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Enter your USN:");
        String usn= sc.nextLine();
        System.out.println("enter the book name: ");
        String issueBook=sc.nextLine();
        System.out.printf("Name: %s USN: %s Book Name: %s \n",name,usn,issueBook);
        for ( int i=0; i<count;i++)
        {
           if (books[i].equals(issueBook)) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                break;
        }
    }


    }
    public void returnBook()
    {
           
             
        System.out.println("Enter your name: ");
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Enter your USN:");
        String usn= sc.nextLine();
        System.out.println("enter the book name: ");
        String returnBook=sc.nextLine();
        System.out.printf("Name: %s USN: %s Book Name: %s \n",name,usn,returnBook);
        addBook(returnBook);
       
}
public class library{
    public static void main(String[] args) {
        System.out.println("Welcome to my library!!!");
        int a=0;
        Record ob = new Record();

         while(a!=4)
        {

        System.out.println("Select your purpose: ");
        System.out.println("1: Show Avaliable Books\n 2: issue a book \n 3: Return a Book\n 4:add a book");
        Scanner sc= new Scanner(System.in);
        int choice = sc.nextInt();
        
       
        switch (choice) {
            case 1:
                ob.showAvailableBooks();            
                
                break;
            case 2:
                ob.issueBook();            
                
                break;
            case 3:
                ob.returnBook();            
                
                break;
             case 4:
                System.out.println("Enter book name: ");
                Scanner s = new Scanner(System.in);
                String something= s.nextLine();
                System.out.println(something);
                ob.addBook(something);            
                
                break;
        
            default:
                System.out.println("Kindly enter valid choice!");
                break;
        }
        a++;
    }

        
    }
}
}