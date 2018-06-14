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
public class FixedBasedPartTime extends PartTime implements IPrintable {
    private double FixedAmount;
    public double calcEarnings() {
        double ear = super.getRate() * super.getHoursWorked();
        double commission = ear*(FixedAmount/100);
        return ear+commission;
    }
    
    public void setFixedAmount(double FixedAmount) {
        this.FixedAmount = FixedAmount;
    }
    
    @Override
    public void printMyData() {
        
    }
    
}
