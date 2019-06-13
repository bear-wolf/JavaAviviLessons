package avivi.home.work14;


import avivi.home.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Work14 extends HomeWork {
    /*
    *   Написати клас Student (описати його поля, конструктори, гетери, сетери, toString)
        створити List, в мейн методі, заповнити даний List екземплярами класу Student.
        Використовуючи Scanner, iterator та listIterator, реалізувати можливість видалення
        елементів Ліста за введеним ім`ям в Консолі, і після кожного видалення виводити даний список , вже без видаленого елемента.

    * */
    List<Student> listStudent = new ArrayList<Student>();

    public Work14() {
        outputHeader(14);
        buildData();
        readConsole();

        if (listStudent.size()==0) {
            System.out.println("The list is empty");
        }
    }

    void readConsole() {
        Scanner scanner = new Scanner(System.in);
        int counter = this.listStudent.size();
        int attempts = 3;

        String value;
        while (counter>0 || attempts>0) {
            printListItems();
            System.out.println();
            if (listStudent.size() == 0) {
                System.out.println("All items was removed");
                attempts = 0;
                continue;
            }

            if (attempts<=0) {
                if (listStudent.size()>0) {
                    System.out.println("There is list have record");
                    System.out.println("Your attempts are over");
                }
                break;
            }

            System.out.println("Typing value parameter by remove item:");
            value = scanner.nextLine();

            if (value != null) {
                for (Iterator i = listStudent.iterator(); i.hasNext();) {
                    if (i.hasNext()) {
                        if (((Student) i.next()).isProperty(value)) {
                            i.remove();
                            counter--;
                        }
                    }
                }
                System.out.println("Remove element by value: "+ value);
            }
            System.out.println();

            attempts--;
        }
    }

    void printListItems(){
        for(Object items: listStudent) {
            System.out.println(items.toString());
        }
    }

    void buildData() {
        listStudent.add(
                new Student("Олексій", "Коваль", "Петрович")
                .setAge(18)
                .setFaculty(Faculty.KSM));
        listStudent.add(
                new Student("Іванов", "Іван", "Петрович")
                        .setAge(20)
                        .setFaculty(Faculty.ITP));
        listStudent.add(
                new Student("Андрій", "Іван", "Петрович")
                        .setAge(24)
                        .setFaculty(Faculty.RTP));
    }

}
