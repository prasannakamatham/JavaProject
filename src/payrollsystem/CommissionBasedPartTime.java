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
public class CommissionBasedPartTime extends PartTime implements IPrintable {
    private int commissionPercent;
    
    public double calcEarnings() {
        double ear = super.getRate() * super.getHoursWorked();
        double commission = ear*(commissionPercent/100);
        return ear+commission;       
    }
    
    @Override
    public void printMyData() {
        
    }
}
