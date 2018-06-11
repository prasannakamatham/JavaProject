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
public class FixedBasedPartTime {
    private double FixedAmount;
    public double calcEarnings() {
        double ear = getRate() * getHoursWorked();
        return ear;
    }
    
}
