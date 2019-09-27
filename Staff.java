public class Staff extends Employee
{
    private double Hourlyrate;
    public double getHourlyrate()
    {
        return Hourlyrate;
    }
    public void setHourlyrate(double hrlyrate)
    {
        Hourlyrate = hrlyrate;
    }
    public Staff()
    {
        super();
        Hourlyrate = 0;
    }
    public Staff(String lname, String fname, String ID, char sx, double hrlyrate)
    {
        super(lname,fname,ID,sx);
        Hourlyrate = hrlyrate;
    }
    public double monthlyEarning()
    {
     return Hourlyrate *160;
    }
    public String toString() // formats the rational number to #/#
    {
        return "ID Employee number: " + super.getID_number() + "/n" + "Employee name" + super.getfirst_name() + " " + super.getLast_name() + "/n" + "Birth date: " + super. + "Full Time /n" + "Monthly Salary" + monthlyEarning();
    }


}
