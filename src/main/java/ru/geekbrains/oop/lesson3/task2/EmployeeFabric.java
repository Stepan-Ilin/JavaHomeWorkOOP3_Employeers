package ru.geekbrains.oop.lesson3.task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();
    private  static String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
    private static String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

    public static Worker generateWorker(){
        int salary = random.nextInt(60000, 120001);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary);
    }

    public static Freelancer generateFreelance(){
        int salary = random.nextInt(350, 700);
        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary);
    }
    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
//    public static Worker[] generateEmployees(int count){
//        Worker[] workers = new Worker[count];
//        for (int i = 0; i < count; i++){
//            workers[i] = generateWorker();
//        }
//        return workers;
//    }
    public static Employee[] generateEmployees(int count){
        Employee[] employeers = new Employee[count];
        for (int i = 0; i < count; i++){
            int num = random.nextInt(2);
            if(num==0) {
                employeers[i] = generateWorker();
            } else {
                employeers[i] = generateFreelance();
            }
        }
        return  employeers;
    }
}
