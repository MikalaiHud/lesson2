package entity;

public class FrontendDeveloper extends Developer {
    public FrontendDeveloper() {
        setName("Vasya");
        setPrimarySkill("Pascal");
        setAge(20);
        setSalary(200);
    }

    public FrontendDeveloper(String name, String primarySkill, int age, int salary) {
        setName(name);
        setPrimarySkill(primarySkill);
        setAge(age);
        setSalary(salary);
    }

    @Override
    public void workMonth(int codeStrings, int stringCost) {
        int monthSalary = codeStrings * stringCost * 25;
        setSalary(getSalary() + monthSalary);
    }
}
