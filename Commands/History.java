package Commands;

import java.util.ArrayList;

public class History extends Store {
    public static void showHistory(){

        for (String result : Storage) {
            System.out.println(result);
        }
    }
}
