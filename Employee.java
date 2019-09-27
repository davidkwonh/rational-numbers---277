import java.util.Calendar;
import java.util.GregorianCalendar;

abstract class Employee {
    private String last_name;
    private String first_name;
    private String ID_number;
    private char SEX;
    private Calendar birthdate;
    birthdate = new GregorianCalendar();
    birthday.get(Calendar.MONTH)

    public Employee()
    {
     last_name = "N/A";
     first_name = "N/A";
     ID_number = "N/A";
     SEX = 'N';

    }
    public Employee(String lname, String fname, String ID, char sx) // used to fill in data for other types of staff
    {
        last_name = lname;
        first_name = fname;
        ID_number = ID;
        SEX = sx;
    }
    public String getLast_name()
    {
        return last_name;
    }
    public String getfirst_name()
    {
        return first_name;
    }
    public String getID_number()
    {
        return ID_number;
    }
    public char getSEX()
    {
        return SEX;
    }
    public void setLast_name(String lname)
    {
        last_name = lname;
    }
    public void setfirst_name(String fname)
    {
        first_name = fname;
    }
    public void setID_number(String ID)
    {
        ID_number = ID;
    }
    public void setSEX(char sx)
    {
        SEX = sx;
    }
    public String toString() // formats the rational number to #/#
    {
        return "ID Employee number:" + ID_number + "/n" + "Employee name" + first_name + " " + last_name + "/n" + "Birth date: " + birthdate;
    }
    public abstract double monthlyEarning();

    // abstract method monthlyEarning that returns the monthly earning.

}
