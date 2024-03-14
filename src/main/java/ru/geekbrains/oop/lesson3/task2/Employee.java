package ru.geekbrains.oop.lesson3.task2;

public abstract class Employee implements Comparable<Employee> {

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Должность
     */
    protected String post;

    /**
     * Возраст
     */
    protected  int age;


    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();


    public Employee(String name, String surName, double salary, String post, int age) {
        this(surName, name, salary);
        this.post = post;
        this.age = age;
    }
    public Employee(String surName, String name, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;

    }

}
