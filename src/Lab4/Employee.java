package Lab4;

/**
 * Created by Christian on 2/7/2017.
 */
public class Employee implements Rules {
    private String name = "";
    private int salary = 0;

    public Employee (String inName, int inSalary){
        this.name = inName;
        this.salary = inSalary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name + " has a salary of " + salary;
    }

}
