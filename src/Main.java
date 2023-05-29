//Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new Random().nextInt(15));
            list.removeIf((n -> n % 2 == 0));
        }
        System.out.println(list);
        int min = Collections.min(list);
        System.out.println(min);
        int max = Collections.max(list);
        System.out.println(max);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        float arm = sum / 15f;
        System.out.println(arm);

    }
}