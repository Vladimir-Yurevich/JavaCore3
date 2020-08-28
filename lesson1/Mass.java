package lesson1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Mass<T> {
    public static void main(String[] args) {
// Задача 1
        String[] frut = {"Lemon", "Banana", "Cherry", "Apple", "Orange"};
        infoArr(frut);
        changeArr(frut);
        infoArr(frut);
// Задача 2
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(frut));
        System.out.println(arrayList);

    }

    public static <T> void changeArr(T... vol) {
        int x = 0;
        int x1 = 1;
        T data = vol[x];
        vol[x] = vol[x1];
        vol[x1] = data;

    }

    public static <T> void infoArr(T... vol) {
        for (int i = 0; i < vol.length; i++) {
            System.out.print(vol[i] + " ");
        }
        System.out.println();
    }

}
// Задача3
// В задаче с фруктами не разобрался, посмотрел как у Вас сделано - попробую переделать
// больше не заглядывая.









