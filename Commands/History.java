package Commands;

import java.util.ArrayList;

public class History extends Store {
    public static void showHistory(){

        for(int i = 0; i<Storage.size(); i++) {
            String result = Storage.get(i);
            System.out.println(result);
        }
    }
}
