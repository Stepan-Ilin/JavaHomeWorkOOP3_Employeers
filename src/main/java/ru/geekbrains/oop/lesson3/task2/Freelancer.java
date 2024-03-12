package ru.geekbrains.oop.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */

public class Freelancer extends Employee {

    private Freelancer(String surName, String name, double hourlyRate) {
        super(surName, name, hourlyRate);
    }

    public static Freelancer create(String surName, String name, double salary){
        return new Freelancer(surName, name, salary);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }
}

