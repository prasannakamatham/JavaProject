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

    public int getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(int commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public CommissionBasedPartTime(int commissionPercent) {
        this.commissionPercent = commissionPercent;
    }
    
    
    
    public double calcEarnings() {
        double ear = super.getRate() * super.getHoursWorked();
        double commission = ear*(commissionPercent/100);
        return ear+commission;       
    }
    
    @Override
    public void printMyData() {
        System.out.println("Name of the Employee"+this.getName());
        System.out.println("\nAge : "+ this.getAge());
        System.out.println("Earnings of Employee: " + this.getEarnings());
        System.out.println("\nEmployee has a Vehicle : " + this.getVehicle());
        System.out.println("\nmake : "+ getVehicle().getMake());
        System.out.println("\n\tRegistration Number : "+getVehicle().getPlate());
        System.out.println("\n\tName of Company : "+getVehicle().getCompany());
        System.out.println("\n\t Year of manufacture : "+getVehicle().getYear());
        System.out.println("\nEmployee is a PartTime / Commissioned\n\tRate : "+this.getRate());
        System.out.println("\n\tHours Worked : "+this.getHoursWorked());
        System.out.println("\n\tCommission : "+this.getCommissionPercent());
        System.out.println("%"+"\n\tEarnings : "+this.calcEarnings());
        System.out.println("CommissionBasedPartTime.ear+" + this.getCommissionPercent());
        
        

    }
        
    
}
