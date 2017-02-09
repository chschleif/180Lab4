package Lab4;

/**
 * @author Christian Schleif
 * Last modified 2/9/2017
 *
 * Faculty class, inheriting employee, represents an individual with a course collection
 */
public class Faculty extends Employee {
    private String[] courses = new String[0];

    /**
     * Faculty constructor with information
     *
     * @param name    The name of the faculty member
     * @param salary  The salary of the individual
     * @param courses The courses the individual teaches
     */
    public Faculty(String name, int salary, String[] courses) {
        super(name, salary);
        this.setCourses(courses);
    }

    /**
     * Get the name of the faculty member.
     *
     * @return The name, prefixed with title Professor
     */
    @Override
    public String getName() {
        return "Professor " + super.getName();
    }

    /**
     * Get a copy of the courses taught by the professor
     *
     * @return A copy array of strings representing courses
     */
    public String[] getCourses() {
        String[] output = new String[courses.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = courses[i];
        }
        return output;
    }

    /**
     * Set the courses that this professor instructs in, making a copy to be safe.
     *
     * @param newCourses The (threadsafe? copysafe?) array to pass in as the professor course list
     */
    public void setCourses(String[] newCourses) {
        // ok we want a copy?
        courses = new String[newCourses.length];
        for (int i = 0; i < courses.length; i++) {
            courses[i] = newCourses[i];
        }
    }

    /**
     * Represent the faculty member in a succinct string.
     *
     * @return The representation including course collection.
     */
    @Override
    public String toString() {
        return super.toString() + " -- Has courses: " + commaJoin(this.courses);
    }

    /**
     * Join an array of strings with a comma
     *
     * @param arr The array of strings (unmodified)
     * @return The string made by combining the strings.
     */
    private String commaJoin(String[] arr) {
        String output = "";
        for (int i = 0; i < arr.length; i++) {
            output += arr[i] + ",";
        }
        return output.substring(0, output.length() - 1);
    }
}
