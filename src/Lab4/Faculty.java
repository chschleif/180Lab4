package Lab4;

/**
 * Created by Christian on 2/7/2017.
 */
public class Faculty extends Employee {
    private String[] courses = new String[0];
    public Faculty(String name, int salary, String[] courses){
        super(name, salary);
        this.setCourses(courses);
    }

    @Override
    public String getName() {
        return "Professor " + super.getName();
    }

    public String[] getCourses(){
        String[] output = new String[courses.length];
        for(int i = 0; i < output.length; i++){
            output[i] = courses[i];
        }
        return output;
    }

    public void setCourses(String[] newCourses){
        // ok we want a copy?
        courses=  new String[newCourses.length];
        for(int i = 0; i < courses.length; i++){
            courses[i] = newCourses[i];
        }
    }

    @Override
    public String toString(){
        return super.toString() + " -- Has courses: " + commaJoin(this.courses);
    }

    private String commaJoin(String[] arr){
        String output = "";
        for(int i = 0; i < arr.length; i++){
            output += arr[i] + ",";
        }
        return output.substring(0, output.length()-1);
    }
}
