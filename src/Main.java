import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("You are in a land of dragons. \nIn front of you," +
                "you see two caves. In one cave, the dragon is friendly and \n" +
                "will share his treasure with you. The other dragon is greedy and hungry \n" +
                "and will eat you on sight. Which cave will you go into? (1 0r 2) ");

        System.out.println(" "); // This code will create a new line
        Scanner userInPut = new Scanner(System.in); // getting the userInPut
        System.out.println("Enter your pick:");

        String userInPutString = userInPut.nextLine(); //store input in a string

        if(Objects.equals(userInPutString,"1")){ // checking user input value
            System.out.println(" ");
            System.out.println("You approach the cave... \n" +
                    "it is dark and spooky... \n" +
                    "A large dragon jumps out in front of you! He opens his jaws and... \n" +
                    "Gobbles you down in one bite!");
        }
    }
}
