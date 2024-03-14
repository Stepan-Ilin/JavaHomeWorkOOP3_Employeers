package ru.geekbrains.oop.lesson3.task2;


/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {
    private Worker(String surName, String name, double salary, String post, int age) {
        super(surName, name, salary,post, age);

    }

    public static Worker create(String surName, String name, double salary, String post, int age){
        return new Worker(surName, name, salary, post, age);
    }

    @Override
    public double calculateSalary() { return salary; }

    @Override
    public String toString() {
        return String.format("%s - %s %s, %d лет; ставка: %.2f руб.; заработная плата: %.2f руб/мес.",
                post, surName, name, age, salary, calculateSalary());
    }
}
