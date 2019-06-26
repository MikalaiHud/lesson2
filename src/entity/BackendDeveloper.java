package entity;

public class BackendDeveloper extends Developer {
    public BackendDeveloper() {
        setName("Petya");
        setPrimarySkill("C#");
        setAge(20);
        setSalary(200);
    }

    public BackendDeveloper(String name, String primarySkill, int age, int salary) {
        setName(name);
        setPrimarySkill(primarySkill);
        setAge(age);
        setSalary(salary);
    }

    @Override
    public void workMonth(int codeStrings, int stringCost) {
        int monthSalary = codeStrings * stringCost * 20;
        setSalary(getSalary() + monthSalary);
    }

}
