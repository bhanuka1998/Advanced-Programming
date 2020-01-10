/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopconcepts;

/**
 *
 * @author cb007874
 */
public class Employee 
{
    private int id;
    private String name;
    private String address;
    
    
    public void showdetails()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
    
    public void setID(int emp_id)  //mutator method
    {
        id = emp_id;
    }
    
    public int getID()  //accessor method
    {
        return id;
    }
    
    public void setName(String emp_name)
    {
        name = emp_name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAddress(String emp_address)
    {
        address = emp_address;
    }
    
    public String getAdress()
    {
        return address;
    }
    
}
