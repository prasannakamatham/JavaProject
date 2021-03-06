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
public class FixedBasedPartTime extends PartTime implements IPrintable {
    private double FixedAmount;

    FixedBasedPartTime() {
         super();
    }

    
    public double calcEarnings() {
        double ear = super.getRate() * super.getHoursWorked();
        double commission = FixedAmount;
        return ear+commission;
    }

    public FixedBasedPartTime(double FixedAmount, double Rate, int HoursWorked, String Name, int Age, double Earnings, payrollsystem.Vehicle Vehicle) {
        super(Rate, HoursWorked, Name, Age, Earnings, Vehicle);
        this.FixedAmount = FixedAmount;
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

    void setVehicle(Motorcycle mt1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
    }
