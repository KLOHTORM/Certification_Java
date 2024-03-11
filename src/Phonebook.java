import java.util.*;
import java.util.Map;

public class Phonebook {
    private static LinkedHashMap<String, String> map = new LinkedHashMap<>();

    public static void add(String name, String number){
        map.put(name, number);
    }

    public static String getAll(){
        return map.toString();
    }





}
