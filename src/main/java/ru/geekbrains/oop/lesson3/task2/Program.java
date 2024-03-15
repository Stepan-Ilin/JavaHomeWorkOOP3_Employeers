/*Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования

        Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.

        Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника. Формула расчета среднемесячной заработной платы может быть такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
        Переработать метод generateEmployees, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого).
        Метод должен быть один!
        Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте
         соответствующее состояние на уровне ваших классов).
        Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.

        Формат сдачи: ссылка на гитхаб проект
*/

package ru.geekbrains.oop.lesson3.task2;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(15);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        //Arrays.sort(employees, new SalaryComparator());
        Arrays.sort(employees, new AgePostComparator());
        System.out.println();
        System.out.println("***");
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }


}
