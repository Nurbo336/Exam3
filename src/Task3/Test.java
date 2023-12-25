package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {

        ArrayList <Integer> i = new ArrayList<>();
        ArrayList <String> str = new ArrayList<>();
        HashMap <String,Integer> users = new HashMap<>();
        users.put("Alex",18);
        users.put("Max",16);
        users.put("Mike",19);
        users.put("Lex",45);
        users.put("Mark",26);
        i.addAll(users.values());
        str.addAll(users.keySet());
        System.out.println("Список юзеров:");
        System.out.println(users.entrySet());
        System.out.println("_______________________");
        Collections.sort(i);
        Collections.sort(str);
        System.out.println("Список возрастов по возрастанию");
        System.out.println(i);
        System.out.println("_______________________");

        System.out.println("Список имен в алфавитном порядке");
        System.out.println(str);
    }
}
