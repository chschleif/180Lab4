package Lab4;

/**
 * @author Christian Schleif
 * Requirements for "Rules" I suppose
 */
public interface Rules {
    /**
     * Implementations must provide a name accessor.
     * @return The name of the instance.
     */
    String getName();

    /**
     * Implementations must provide a salary accessor.
     * @return The salary of the instance.
     */
    int getSalary();
}
