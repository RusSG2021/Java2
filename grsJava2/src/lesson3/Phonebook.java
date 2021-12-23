package lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    public static Map<Integer, String> phonebook = new HashMap<>();

    public static void add(Integer num, String surname){
        phonebook.put(num, surname);
    }

    public static Set get(String surname){
        Set<Integer> phoneNumbers = new HashSet<>();
        for (Map.Entry<Integer, String> map: phonebook.entrySet() ) {
            if (map.getValue().equals(surname)) phoneNumbers.add(map.getKey());
        }

        return phoneNumbers;
    }
}
