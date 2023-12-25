package Task4;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        HashMap <String,String> word = new HashMap<>();
        word.put("Apple","Яблоко");
        word.put("Laptop","Ноутбук");
        word.put("Home","Дом");
        word.put("Brother","Брат");
        word.put("Ball","Мяч");
        System.out.println("Введите английскую слову");
        Scanner sc = new Scanner(System.in);
        String english = sc.nextLine();
        if(word.keySet().contains(english)){
            System.out.println("Перевод слова "+ english+ "-"+ word.get(english));
        }
        else {
            System.out.println("Слово не найдено в базе");
        }
    }
}

