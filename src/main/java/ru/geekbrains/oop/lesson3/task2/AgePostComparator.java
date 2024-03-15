package ru.geekbrains.oop.lesson3.task2;

import java.util.Comparator;

public class AgePostComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int result = o1.post.compareTo(o2.post);
        if(result == 0){
            return Integer.compare(o1.age, o2.age);
        }else return result;
    }
}
