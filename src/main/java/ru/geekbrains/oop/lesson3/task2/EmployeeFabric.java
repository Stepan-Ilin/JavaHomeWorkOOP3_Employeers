package ru.geekbrains.oop.lesson3.task2;

import java.util.Random;

public class EmployeeFabric {

    private static final Random random = new Random();
    private  static final String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
    private static final String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

    public static Worker generateWorker(){
        int salary = random.nextInt(60000, 120001);
        int age = random.nextInt(18, 70);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary,
                "Рабочий",
                random.nextInt(18,60));
    }
    /**
     * TODO СТАНИСЛАВ, У МЕНЯ ВОПРОС?
     * TODO НА ПРЕДПРИЯТИИ МНОГО ДОЛЖНОСТЕЙ, И ИХ ВРЕМЯ ОТ ВРЕМЯНИ НАДО ИЗМЕНЯТЬ, ДОБАВЛЯТЬ Т.Е.
     * TODO ЛЕЗТЬ КОД И В ОСНОВНОМ КОПИПАСТИТЬ КОД? - ЭТО НЕ ПРАВЕЛЬНО.
     * TODO МОЖНО ЛИ В ОДНОМ МЕТОДЕ (МЕХАНИЗМЕ) ГЕНЕРИРОВАТЬ ЛЮБЫЕ ДОЛЖНОСТИ Т.Е. ЛЮБЫЕ КЛАССЫ? Т.Е. ЭТОТ МЕТОД (GENERATION),
     * TODO В КОТОРОМ НА ВЫХОДЕ ВЫЗАВАЛ СТАТИЧЕСКИЙ МЕТОД (CREATE) КЛАССА, А - ЭТОТ КЛАСС МЕНЯЛСЯ БЫ В ЗАВИСИМОСТИ ОТ
     * TODO ВХОДНОГО ПАРАМЕТРА МЕТОДА (GENERATION), НУ НАПРИМЕР НАЗВАНИЕ КЛАССА и другие параметры для создания экземпляра класса.
     * todo ТОГДА БЫЛ БЫ ОДИН МЕТОД (GENERATION) ДЛЯ ВСЕХ МЕТОДОВ (CREATE) КАЖДЫЙ СВОЕМ КЛАССЕ.
     * TODO  Это возможно? или как нибудь подругому, чтобы не писать каждой должности по похожему методу, как я это сделал.
     * TODO И можно создавать все должности через цикл вызывая один метод с параметрами для создания экземпляра должности.
     */
    public static Freelancer generateFreelance(){
        int salary = random.nextInt(350, 700);
        int age = random.nextInt(18, 70);
        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary,
                "Фрилансер",
                random.nextInt(18,60));
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */

    public static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++){

            int num = random.nextInt(2);
            if(num==0) {
                employees[i] = generateWorker();
            } else {
                employees[i] = generateFreelance();
            }
        }
        return  employees;
    }
}
