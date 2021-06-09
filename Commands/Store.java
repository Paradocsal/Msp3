package Commands;

import java.util.ArrayList;

public class Store {

    protected static ArrayList<String> Storage = new ArrayList<String>();

    public static void addResult(String result){
        Storage.add(result);
    }

    public static String getLastResult(){
        return Storage.get(Storage.size()-1);
    }

    public static ArrayList<String> getHistory(){
        return Storage;
    }
}
