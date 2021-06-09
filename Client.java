import Commands.*;

import java.util.Scanner;

public class Client {
    public static void Start(){

        System.out.println("Enter you action, use >help to get the list of all commands");
        Inputting();

    }
    public static void Inputting() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String[] inputParts = input.split(" ", 4);

        while (!Exit.exit(inputParts[0])) {
            switch (inputParts[0]) {
                case "":
                    break;
                case "help":
                    Help.help();
                    break;
                case "shot":
                    Shooting.Shoot(inputParts[1], inputParts[2], inputParts[3]);
                    break;
                case "history":
                    History.showHistory();
                    break;
                default:
                    System.out.println('"' + input + "\" is not an available command. Use >help to get a list of available commands");
                    break;
            }

            input = sc.nextLine().toLowerCase();
            inputParts = input.split(" ", 4);

        }
    }

}
