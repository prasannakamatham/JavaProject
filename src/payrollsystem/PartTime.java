/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author Prasanna
 */
public abstract class PartTime extends Employee implements IPrintable {
    
    private double Rate;
    private int HoursWorked;

    public PartTime(double Rate, int HoursWorked, String Name, int Age, double Earnings, payrollsystem.Vehicle Vehicle) {
        super(Name, Age, Earnings, Vehicle);
        this.Rate = Rate;
        this.HoursWorked = HoursWorked;
    }
    
    
    

    public double getRate() {
        return Rate;
    }

    public void setRate(double Rate) {
        this.Rate = Rate;
    }

    public int getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(int HoursWorked) {
        this.HoursWorked = HoursWorked;
    }
    
    

}


