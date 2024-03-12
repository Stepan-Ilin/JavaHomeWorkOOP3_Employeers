package ru.geekbrains.oop.lesson3.task2;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Worker[] workers = EmployeeFabric.generateEmployees(15);
        for (Worker worker : workers) {
            System.out.println(worker);
        }

        Arrays.sort(workers/*, new SalaryComparator()*/);

        System.out.println();
        System.out.println("***");
        System.out.println();

        for (Worker worker : workers) {
            System.out.println(worker);
        }

    }

}
