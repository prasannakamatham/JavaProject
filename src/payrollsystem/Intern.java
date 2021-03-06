/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author Anvesh
 */
public class Intern extends Employee implements IPrintable{
    
    private String SchoolName;

    public Intern(String SchoolName, String Name, int Age, double Earnings, payrollsystem.Vehicle Vehicle) {
        super(Name, Age, Earnings, Vehicle);
        this.SchoolName = SchoolName;
    }

    Intern() {
        super();
    }

    
    
    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }
    
    @Override
    public void printMyData(){
         System.out.println("Name:"+this.getName());
         System.out.println("year of Birth:"+this.CalcBirthYear());
         System.out.println("Employee has no Vehicle\nEmployee is Intern\n\tschool:"+ this.SchoolName);
         System.out.println("Earnings:"+this.getEarnings());
    }
    
    
}
