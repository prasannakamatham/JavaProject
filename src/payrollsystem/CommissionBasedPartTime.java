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
public class CommissionBasedPartTime extends PartTime implements IPrintable {
    private double commissionPercent;

    CommissionBasedPartTime() {
        super();
    }

   

    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(double commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public CommissionBasedPartTime(double commissionPercent, double Rate, int HoursWorked, String Name, int Age, double Earnings, payrollsystem.Vehicle Vehicle) {
        super(Rate, HoursWorked, Name, Age, Earnings, Vehicle);
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

    void setVehicle(Car vh2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
