import Commands.*;

import java.util.Scanner;

class Client {
    static void Start(){

        System.out.println("Enter you action, use >help to get the list of all commands");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String[] inputParts = input.split(" ", 4);

        while (!Exit.exit(inputParts[0])) {
            if (inputParts[0].equals("")) {
                break;
            } else if (inputParts[0].equals("help")) {
                Help.help();
                break;
            } else if (inputParts[0].equals("shot")) {
                Shooting.Shoot(inputParts[1], inputParts[2], inputParts[3]);
                break;
            } else if (inputParts[0].equals("history")) {
                History.showHistory();
                break;
            } else {
                System.out.println('"' + input + "\" is not an available command. Use >help to get a list of available  commands");
                break;
            }

        }
        input = sc.nextLine().toLowerCase();
        inputParts = input.split(" ", 4);



        }

    }



