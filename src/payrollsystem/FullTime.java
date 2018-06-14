/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author Anvesh
 */
public class FullTime extends Employee implements IPrintable{
    private double Salary;
    private double Bonus;

    public FullTime(double Salary, double Bonus, String Name, int Age, double Earnings, payrollsystem.Vehicle Vehicle) {
        super(Name, Age, Earnings, Vehicle);
        this.Salary = Salary;
        this.Bonus = Bonus;
    }

    FullTime() {
        super();
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
        System.out.println("name:"+this.getName());
        System.out.println("Year of Birth:"+this.CalcBirthYear());
        System.out.println("Employee has a C\n\tMaker:"+getVehicle().getMake());
        System.out.println("Registration Number:"+getVehicle().getPlate());
        System.out.println("Type of Company:"+getVehicle().getCompany());
        System.out.println("Year:"+getVehicle().getYear());
        System.out.println("Employee is FullTime\n\tSalary:"+this.Salary);
        System.out.println("Bonus:"+this.Bonus);
        System.out.println("Earnings:"+this.getEarnings());
    }

    void setVehicle(Car vh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
