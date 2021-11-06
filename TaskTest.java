
/**
 * Write a description of class TaskTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TaskTest
{
    public static void main(String[] args){
        Task task1 = new Task("Eat");
        Task task2 = new Task("Sleep");
        Task task3 = new Task("Finish APCSA Labs");
        Task task4 = new Task("Exercise");
        Task task5 = new Task("Watch TV");
        
        task1.setPriority(Priority.MIN_PRIORITY);
        task2.setPriority(2);        
        task3.setPriority(Priority.MED_PRIORITY);
        task4.setPriority(2);
        task5.setPriority(Priority.MAX_PRIORITY);  
        
        comparePriorities(task2,task4);
        comparePriorities(task1,task2);
        comparePriorities(task3,task4);
    }
    public static void comparePriorities(Task blop, Task blip){
        if (blop.compareTo(blip)==0){
            System.out.println("\""+blop.taskName+"\" has equal priority to \""+blip.taskName+"\".");}
        else if(blop.compareTo(blip)==1){
            System.out.println("\""+blop.taskName+"\" has lower priority than \""+blip.taskName+"\".");}
        else{
            System.out.println("\""+blop.taskName+"\" has higher priority than \""+blip.taskName+"\".");}       
    }
}
