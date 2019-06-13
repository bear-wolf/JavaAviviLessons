package avivi.home.work12;

import avivi.home.HomeWork;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Work12 extends HomeWork {
    int maxCell = 10;
    /*
    *   Написати програму яка створює List<Integer> ints
        Наповнити список 10-ма довільними числами
        Створити новий список List<Integer> doubledInts
        Перенести кожне друге подвоїне число (х2) до нового списку
        Вивести в консоль перший список. Другий список в зворотньому порядку
    * */

    public Work12() {
        outputHeader(12);

        int number;

        Random random = new Random();

        List<Integer> ints = new ArrayList<>(maxCell);
        List<Integer> doubledInts = new ArrayList<>(maxCell);

        for (int i = 1; i<= 10; i++) {
            number = random.nextInt(maxCell);
            ints.add(number);
            if ( i%2 == 0) {
                doubledInts.add(number*2);
            }
        }

        System.out.println(ints);
        System.out.println();
        System.out.println(getReverce(doubledInts));
    }

    List getReverce(List data) {
        List newData = data;

        Collections.reverse(newData);
        return newData;
    }

}
