package lesson3;

import java.util.HashMap;
import java.util.Map;

public class Lesson3Main {
    public static void main(String[] args) {
        String[] array = {"Apple",
                "Peach",
                "Melon",
                "Apple",
                "Watermelon",
                "Cucumber",
                "Peach",
                "Peach",
                "Tomato",
                "Cherry",
                "Cucumber"};

        Map<String, Integer> map = new HashMap<>();
        for (String s : array) {
            Integer count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }
        //  System.out.println(map);

        Phonebook.add(1, "aaa");
        Phonebook.add(2, "aa4a");
        Phonebook.add(3, "aaa");
        Phonebook.add(4, "aafda");
        Phonebook.add(5, "aa4a");
        Phonebook.add(6, "aaa");

        //System.out.println(Phonebook.phonebook);
        System.out.println(Phonebook.get("aa4a"));

    }
}
