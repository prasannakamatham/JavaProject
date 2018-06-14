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
public class PayrollSystem {

    /**
     * @param args the command line arguments
     */
   
        
   public static void main(String[] args) {

    

        Intern i1 = new Intern();

		i1.setAge(23);i1.setName("Akshay");i1.setSchoolName("lambton");i1.setEarnings(2000);

		
                i1.printMyData();

		System.out.println("=========================================");

		

		FullTime ft1 = new FullTime();

		Car vh = new Car();

		ft1.setName("Anvesh");ft1.setAge(24);ft1.setVehicle(vh);ft1.setSalary(1500.00);ft1.setBonus(200.50);

		vh.setMake("Toyota");vh.setPlate("AP07 7483");vh.setSpeed("140");vh.setYear(2010);

		

		ft1.printMyData();

		System.out.println("=========================================");

		CommissionBasedPartTime cb1 = new CommissionBasedPartTime();

		Car vh2 = new Car();

		cb1.setName("Vijay");cb1.setAge(35);cb1.setVehicle(vh2);cb1.setRate(25);cb1.setHoursWorked(8);cb1.setCommissionPercent(10);

		vh2.setMake("Audi");vh2.setPlate("TS99 0239");vh2.setSpeed("150");vh2.setYear(2016);

		cb1.printMyData();

		

		System.out.println("=========================================");

		

		FixedBasedPartTime fbpt1 = new FixedBasedPartTime();

		Motorcycle mt1 = new Motorcycle();

		fbpt1.setName("Prem");fbpt1.setAge(28);fbpt1.setVehicle(mt1);mt1.setMake("Ducati");mt1.setSpeed("110");mt1.setGear("5");

		mt1.setColor("Black");fbpt1.setRate(10);fbpt1.setHoursWorked(20);fbpt1.setFixedAmount(75);

		fbpt1.printMyData();

    }

}