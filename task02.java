import java.util.ArrayList;
import java.util.Random;

// Задача №2 Задан целочисленный список ArrayList. 
//Найти минимальное, максимальное и среднее из этого списка.
public class task02 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(100));
            //System.out.printf("%d ", list[i]);
        }
        System.out.println(list);
        int max = 0;
        int min = list.get(0);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        int sa = sum/list.size();
        System.out.printf("Максимальное значение = %d\nМинимальное значение = %d\nСреднее значение = %d\n", max, min, sa);
    }
}
