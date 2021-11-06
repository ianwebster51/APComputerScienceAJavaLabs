
/**
 * Write a description of class Task here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task implements Priority,Comparable
{
    int priority;
    String taskName;
    public Task(String name){taskName = name;}
    public String getTask(){return taskName;}
    public void setPriority(int value){priority = value;}
    public int getPriority(){return priority;}
    public String toString(){return "Task Name = "+taskName+"; Priority = "+priority;}
    public int compareTo(Object blip){
        Task blop = (Task)blip;
         if(this.priority == blop.priority){return 0;}
         else if (this.priority>blop.priority){return 1;}
         else{return -1;}
    }
}
