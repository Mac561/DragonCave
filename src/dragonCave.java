import java.util.Objects;
import java.util.Scanner;

public class dragonCave {
    public static void main(String[] args) {
        int x = 1;
        do {
            try {
                System.out.println("You are in a land of dragons. \nIn front of you," +
                        "you see two caves. In one cave, the dragon is friendly and \n" +
                        "will share his treasure with you. The other dragon is greedy and hungry \n" +
                        "and will eat you on sight. Which cave will you go into 1 or 2?");
                System.out.println("Enter your pick (1 or 2:)");
                Scanner userInPut = new Scanner(System.in); // getting the userInPut
                String userInPutString = userInPut.nextLine(); //store input in a string
                if (Objects.equals(userInPutString, "1")) { // checking user input value
                    System.out.println(" ");
                    System.out.println("You approach the cave... \n" +
                            "it is dark and spooky... \n" +
                            "A large dragon jumps out in front of you! He opens his jaws and... \n" +
                            "Gobbles you down in one bite!");
                } else {
                    if (Objects.equals(userInPutString, "2")) {
                        System.out.println("Congratulation you picked the friendly dragon cave");
                    }
                }
                x = 2;
            } catch (Exception e) {
                System.out.println("Please enter a valid number");
            }
        } while (x == 1);

    }
}
