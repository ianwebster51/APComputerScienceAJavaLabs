
/**
 * Write a description of class Priority here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Priority
{
    int MIN_PRIORITY = 1;
    int MED_PRIORITY = 5;
    int MAX_PRIORITY = 10;
    public int getPriority();
    public void setPriority(int value);
}
