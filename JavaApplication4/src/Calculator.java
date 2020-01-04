/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cb007874
 */
public class Calculator 
{
    int num1;
    int num2;
    
    public int add()
    {
        int total = num1 + num2;
        return total;
    }
    
    public int sub()
    {
        return num1 - num2;
    }
    
    public int mul()
    {
        return num1 * num2;
    }
    
    public int div()
    {
        int div = 0;
        if (num2 > 0)
        {
           div = num1/num2;
        }
        return div;
    }
    
}
