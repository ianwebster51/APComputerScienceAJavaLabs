
/**
 * Write a description of class Name here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Name
{
    public String first, middle, last, fullName;
    
    public Name(String firstName, String middleName, String lastName){
         first = firstName;
         middle = middleName;
         last = lastName;
         fullName  = first+middle+last;
    }
    public String getFirst(){return first;}
    public String getMiddle(){return middle;}
    public String getLast(){return last;}
    public String firstMiddleLast(){return (first+" "+middle+" "+last);}
    public String lastFirstMiddle(){return (last+", "+first+" "+middle);}
    public boolean equals(String Name, String otherName){
        boolean bop;
        if (Name.equalsIgnoreCase(otherName)){bop = true;}
        else{bop = false;}
        return bop;
    }
    public String initials(){
        return ((first.substring(0,1)).toUpperCase()
        +(middle.substring(0,1)).toUpperCase()+(last.substring(0,1)).toUpperCase());
    }
    public int length(){
         return (first+middle+last).length();
    }
    
}
