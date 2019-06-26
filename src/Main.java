import entity.BackendDeveloper;
import entity.Developer;
import entity.FrontendDeveloper;

//TODO: Написать геттеры сеттеры, для всех полей в abstract entity.Developer.
// 1.Создать backendDeveloper и frontendDeveloper задать им name, primarySkill, age, salary.
// Вывести значение name, primarySkill, age, salary для backendDeveloper и frontendDeveloper в консоль.
// 2. написать метод workMonth() для abstract entity.Developer.
// Метод должен принимать на вход количество строк, написанных программистом за день codeStrings(int), стоимость каждой строки stringCost(int)
// Метод должен возврашать зарплату программиста за месяц (23 рабочих дня) monthSalary(int);
// 3. Изменить метод workMonth в классе abstract entity.Developer. Не должен возращать значение(double), а прибавлять результат к полю salary.
// 4. Переопределить метод workMonth в классах наследниках. backendDeveloper работает 20 дней в месяце, а frontendDeveloper 25.
// 5. Написать конструктор с параметрами и каонструктор без параметров, в котором будут задаваться значения по умолчанию.
// 6. Создать объект, с вызовом контрукторов с параметрами, для классов backendDeveloper и frontendDeveloper.
public class Main {
    public static void main(String[] args) {
        Developer backendDeveloper = new BackendDeveloper();
        Developer frontendDeveloper = new FrontendDeveloper();

        // Пример задания значения с помощью Сеттера.
        backendDeveloper.setName("Коля");
        // Пример вывода на консоль с помощью Геттера.
        System.out.println(backendDeveloper.getName());
        backendDeveloper.setPrimarySkill("Java");
        System.out.println(backendDeveloper.getPrimarySkill());
        backendDeveloper.setAge(20);
        System.out.println(backendDeveloper.getAge());
        backendDeveloper.setSalary(400);
        System.out.println(backendDeveloper.getSalary());
        backendDeveloper.workMonth(2000, 2);
        System.out.println();

        frontendDeveloper.setName("Артём");
        System.out.println(frontendDeveloper.getName());
        frontendDeveloper.setPrimarySkill("HTML");
        System.out.println(frontendDeveloper.getPrimarySkill());
        frontendDeveloper.setAge(20);
        System.out.println(frontendDeveloper.getAge());
        frontendDeveloper.setSalary(700);
        System.out.println(frontendDeveloper.getSalary());
        frontendDeveloper.workMonth(3400, 5);


        Developer developer1 = new FrontendDeveloper("Nikita", "Perl", 2, 1);
        Developer developer2 = new BackendDeveloper("Nikita", "Perl", 2, 1);
        System.out.println(developer1);
        System.out.println(developer2);
    }
}
