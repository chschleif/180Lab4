package Lab4;

/**
 * @author Christian Schleif
 * Last modified 9 Feb 2017
 * A class representing an employee. Implements interface Rules
 */
public class Employee implements Rules {
    private String name = "";
    private int salary = 0;

    /**
     * Employee constructor including individual's name and salary
     * @param inName The employee's name
     * @param inSalary The employee's salary
     */
    public Employee (String inName, int inSalary){
        this.name = inName;
        this.salary = inSalary;
    }

    /**
     * Get the salary of this employee
     * @return The salary
     */
    @Override
    public int getSalary() {
        return salary;
    }

    /**
     * Get the name of the employee
     * @return The name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Get the representation of the employee, with name and salary
     * @return A string of name and salary for the employee.
     */
    @Override
    public String toString(){
        return name + " has a salary of " + salary;
    }

}
