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
public class CommissionBasedPartTime {
    private int commissionPercent;
    
    public double calcEarnings() {
        double ear = getRate() * getgetHoursWorked();
        double commission = ear*(commissionPercent/100);
        return ear+commission;
        
    }
}
