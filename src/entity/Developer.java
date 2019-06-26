package entity;

public abstract class Developer {
    private String name;
    private String primarySkill;
    private int age;
    private int salary;

    //Геттер возвращает значение private переменной.
    public String getName() {
        return name;
    }

    //Сеттер задает значение private переменной.
    public void setName(String name) {
        this.name = name;
    }

    public String getPrimarySkill() {
        return primarySkill;
    }

    public void setPrimarySkill(String primarySkill) {
        this.primarySkill = primarySkill;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void workMonth(int codeStrings, int stringCost) {
        double monthSalary = codeStrings * stringCost * 23;
        salary += monthSalary;
    }

    @Override
    public String toString() {
        return "Developer{" + name + ", " + primarySkill + ", " + age + ", " + salary + "}";
    }
}
