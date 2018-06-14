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
public class FullTime extends Employee implements IPrintable{
    private double Salary;
    private double Bonus;

    public FullTime(double Salary, double Bonus, String Name, int Age, double Earnings, payrollsystem.Vehicle Vehicle) {
        super(Name, Age, Earnings, Vehicle);
        this.Salary = Salary;
        this.Bonus = Bonus;
    }
    
    

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }


    
    @Override
    public void printMyData()
    {
        System.out.print(this.getName() +"" +""+"");
    }
}
