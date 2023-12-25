package Task1;

import java.util.ArrayList;

public class Inventory {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        addProduct(arrayList, "Phone");
        addProduct(arrayList, "Phone");
        deleteProduct(arrayList, "Phone");

        searchProduct(arrayList, "Phone");

    }

    static void addProduct(ArrayList<String> staff, String myStaff) {
        staff.add(myStaff);
        if (staff.contains(myStaff)) {
            System.out.println("Этот товар уже существует");
        }
    }

    static void deleteProduct(ArrayList<String> staff, String myStaff) {
        staff.remove(myStaff);
            System.err.println("Вы не можете удалить не существующий товар");
    }

    static void searchProduct(ArrayList<String> staff, String myStaff) {
        if (staff.contains(myStaff)) {
            System.out.println("Товар есть в наличии");
        } else {
            System.out.println("Товар не найден");
        }
    }
}