/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author macstudent
 */
public class Intern extends Employee implements IPrintable{
    
    private String SchoolName;

    public Intern(String SchoolName, String name, int age, double earnings, Vehicle vehicle) {
        super(name, age, earnings, vehicle);
        this.SchoolName = SchoolName;
    }
   
    
    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }
    
    @Override
    public void printMyData(){
        
    }
    
    
}
