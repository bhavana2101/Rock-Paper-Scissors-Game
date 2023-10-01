import java.util.InputMismatchException;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3};
        String[] str = {"rock","paper","scissors"};
        System.out.println("You are all set  to play rock,paper and scissors....");
        while(true) {
            try {
                System.out.println("Enter 1 for rock, 2 for paper and 3 for scissors or Enter 0 to exit : ");
                int enteredNumber = sc.nextInt();
                int numberByComp = rockPaperScissorsGame();
                if (enteredNumber == 0) {
                    System.out.println("Exiting...!");
                    break;
                }
                else if(enteredNumber<0 || enteredNumber>3){
                    System.out.println("Only inputs 1,2 and 3 are valid");
                    continue;
                }
                for (int x : array) {
                    if (enteredNumber == x) {
                        if (numberByComp == enteredNumber) {
                            System.out.println("Computer : " + str[numberByComp - 1]);
                            System.out.println("You : " + str[enteredNumber - 1]);
                            System.out.println("Its a tie.....");
                        } else if (numberByComp == 1 && enteredNumber == 2 || numberByComp == 3 && enteredNumber == 1 || numberByComp == 2 && enteredNumber == 3) {
                            System.out.println("Computer : " + str[numberByComp - 1]);
                            System.out.println("You : " + str[enteredNumber - 1]);
                            System.out.println("hurrayy....you won");
                        } else if (numberByComp == 1 && enteredNumber == 3 || numberByComp == 2 && enteredNumber == 1 || numberByComp == 3 && enteredNumber == 2) {
                            System.out.println("Computer : " + str[numberByComp - 1]);
                            System.out.println("You : " + str[enteredNumber - 1]);
                            System.out.println("offoo...you lost..");
                        }
                    }
                }
            }
            catch (InputMismatchException e) {
                System.out.println("You have entered in-valid input! Exiting.....");
                break;
            }
        }
    }
    public static int rockPaperScissorsGame(){
        int min = 1;
        int max = 4;
        double r = Math.random();
        int number = (int)(r*(max-min))+min;
        return number;
    }
}
