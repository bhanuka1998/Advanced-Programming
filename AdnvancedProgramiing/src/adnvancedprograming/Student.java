/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adnvancedprograming;

/**
 *
 * @author cb007874
 */
public class Student 
{
    int idnumber;
    String name;
    String address;
    
    public void viewDetails()
    {
        System.out.println("ID Number: "+idnumber);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        
    }
}
