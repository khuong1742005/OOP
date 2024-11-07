package Chuong3.Bai6;

public class Employee extends Person{
    private String employeeId;
    private String dateHired;

    public Employee(){
        super();
    }
    public Employee(String name, int age, char gender, String employeeId, String dateHired)
    {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.dateHired = dateHired;
    }

    public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }
    public void setdateHired(String dateHired)
    {
        this.dateHired = dateHired;
    }

    public String getemployeeId()
    {
        return this.employeeId;
    }
    public String getdateHired()
    {
        return this.dateHired;
    }

    public String toString()
    {
        return super.toString() + "Employee Id = " + getemployeeId() + ", Date Hired = " + getdateHired() + ", ";
    }
}
