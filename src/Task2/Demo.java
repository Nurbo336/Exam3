package Task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> set = new HashSet<>();
        System.out.println("Добавьте числа в первую строку");
        String num1 = sc.nextLine();
        set.add(num1);
        System.out.println("Добавьте числа во вторую строку");
        String num2 = sc.nextLine();
        set.add(num2);
        System.out.println("Числа, которые встречаются и в первой, и во второй строке, без повторений.");
        for(String iter: set){
            System.out.println(iter);
        }
    }
}
