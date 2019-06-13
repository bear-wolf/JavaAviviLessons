package avivi.home.work11;


import avivi.home.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Work11 extends HomeWork {
    int maxCell = 10;
    /*
    *   Створити класи Pair<L, R>, Triple<L, M, R>. Описати в ньому дженеріками – поля,
        гетери/сетери, toString.
        Створити Main клас в якому створити Pair, Triple різних типів і вивести їхні значення в консоль
        Створити клас ArrayUtils з статичним generic методом, який перевіряє чи є елемент в масиві.
        В класі Main викликати метод класу ArrayUtils з різними аргументами.
    * */

    public Work11() {
        outputHeader(11);
        List<Object> item = new ArrayList<>();

        item.add( new Pair(10, 20));
        item.add(new Triple(10, 20, 30));
        item.add( new Pair("test", "me"));
        item.add( new Triple("test", "me", "again"));

        for (Object element: item) {
            System.out.println(element.toString());
        }

        //ArrayUtils.generic(item); // Here I will be output in console bollean status exist in Array
    }

//    public Work11() {
//        outputHeader(11);
//        List<Object> item = new ArrayList<>();
//
//        Pair<Integer, Integer> p = new Pair(10, 20);
//        Triple<Integer, Integer, Integer> t = new Triple(10, 20, 30);
//
//        Pair<String, String> p1 = new Pair("test", "me");
//        Triple<String, String, String> t1 = new Triple("test", "me", "again");
//
//        System.out.println(p.toString());
//        System.out.println(t.toString());
//        System.out.println();
//        System.out.println(p1.toString());
//        System.out.println(t1.toString());
//
//        item.add(p);
//        item.add(p1);
//        item.add(t);
//        item.add(t1);
//
//        ArrayUtils.generic(item, p); // Here I will be output in console bollean status exist in Array
//    }
}
