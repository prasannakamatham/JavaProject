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
        double commission = FixedAmount;
        return ear+commission;
    }
    
    public void setFixedAmount(double FixedAmount) {
        this.FixedAmount = FixedAmount;
    }

    public double getFixedAmount() {
        return FixedAmount;
    }
    
    
    
    @Override
    public void printMyData() {
        System.out.println("Name : "+this.getName());
        System.out.println("\nYear of Birth : "+this.CalcBirthYear());
        System.out.println("\nEmployee has a MotorCycle\n\tMake : "+getVehicle().getMake());
        System.out.println("\n\tLicense Plate : "+getVehicle().getPlate());
        System.out.println("\n\tCompany : "+getVehicle().getCompany());
        System.out.println("\n\tYear of Manufacture : "+getVehicle().getYear());
        System.out.println("\nEmployee is PartTime / Fixed Amt\n\t Rate : "+this.getRate());
        System.out.println("\n\tHours Worked : "+this.getHoursWorked());
        System.out.println("\n\tFixed Amount : "+this.FixedAmount);
        System.out.println("\n\tEarnings : "+this.calcEarnings());
        System.out.println("FixedBasedPartTime.ear+" + this.FixedAmount);	

	}
        
        
    }
