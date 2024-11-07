package Chuong3.Bai6;

public class PartTimeEmployee extends Employee{
    private int hoursPerWeek;

    public PartTimeEmployee()
    {
        super();
    }
    public PartTimeEmployee(String name, int age, char gender, String employeeId, String dateHired, int hoursPerWeek)
    {
        super(name, age, gender, employeeId, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek)
    {
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek()
    {
        return this.hoursPerWeek;
    }

    public String toString()
    {
        return super.toString() + "Hours Per Week = " + getHoursPerWeek() + "]";
    }

}
