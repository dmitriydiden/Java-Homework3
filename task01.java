import java.util.ArrayList;
import java.util.Random;

// Задача №1. Пусть дан произвольный список целых чисел, необходимо удалить из него четные числа

public class task01 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(100));
            //System.out.printf("%d ", list[i]);
        }
        System.out.println(list);
        int i = 0;
        while (i< list.size()) {
            if (list.get(i)%2==0) {
                list.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(list);
    }
}