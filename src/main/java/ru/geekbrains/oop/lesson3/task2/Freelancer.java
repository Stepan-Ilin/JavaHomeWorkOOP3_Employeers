package ru.geekbrains.oop.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */


public class Freelancer extends Employee {

    private Freelancer(String surName, String name, double salary, String post, int age) {
        super(surName, name, salary, post, age);

    }

    public static Freelancer create(String surName, String name, double salary, String post, int age){
        return new Freelancer(surName, name, salary, post, age);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s - %s %s, %d лет; почасовая ставка: %.2f руб.; заработная плата: %.2f руб/мес.",
                post, surName, name, age, salary, calculateSalary());
    }


}


