package adnvancedprograming;

public class AdnvancedPrograming 
{

    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.idnumber = 1001;
        s1.name = "Dean";
        s1.address = "Sacramento";
        s1.viewDetails();
        
        Student s2 = new Student();
        s2.idnumber = 1002;
        s2.name = "Sam";
        s2.address = "Las vegas";
        s2.viewDetails();
    }
    
}
