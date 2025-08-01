import java.util.Scanner;
public class Welcome {


           public static void main(String[] args){
              
           Scanner myObj = new Scanner (System.in);
           System.out.print("Enter your Fisrt name:");

     String userName1= myObj.nextLine();
     System.out.print("Enter your Last name:");
     String userName2 =  myObj.nextLine();
     System.out.println("Welcome to the Second Year " + userName1 + " " + userName2 + "!");

}
}
