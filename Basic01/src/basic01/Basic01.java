package basic01;
import java.io.*;

public class Basic01 
{

    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(isr);
        Employee emp1 = new Employee();
        emp1.nic = "983262821V";
        emp1.name = "Bhanuka";
        emp1.viewDetails();
        System.out.println("Input OT rate: ");
        emp1.otrate = Double.parseDouble(stdin.readLine());
        System.out.println("Input Ot Hours: ");
        emp1.othours = Double.parseDouble(stdin.readLine());
        System.out.println("Input Basic Salary: ");
        emp1.basicsal = Double.parseDouble(stdin.readLine());
        System.out.println("Net salary is:"+emp1.calcNetSal());
    }
    
}
