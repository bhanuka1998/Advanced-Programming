package basic01;

public class Employee 
{
    String nic;
    String name;
    double basicsal;
    double otrate;
    double othours;
    
    
    public void viewDetails()
    {
        System.out.println("NIC No.:"+nic);
        System.out.println("Name: "+name);
    }
    public double calcNetSal()
    {
        double netsalary;
        netsalary = (otrate*othours) + basicsal;
        return netsalary;
    }
}
