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
public class OopConcepts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        e1.setID(1234);
        e1.getID();
        e1.setName("Dean");
        e1.getName();
        e1.setAddress("California");
        e1.getAdress();
        e1.showdetails();
    }
    
}
