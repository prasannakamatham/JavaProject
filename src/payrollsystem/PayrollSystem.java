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
        
        
        Intern i= new Intern();

   

		i.setAge(23);i.setName("Caio");i.setSchoolName("lambton");i.setEarnings(1200);

		

		i.printMyData();

		System.out.println("=========================================");

		

		FullTime ft = new FullTime();

		Car vh = new Car();

		ft.setName("Andy");ft.setAge(35);ft.setVehicle(vh);ft.setSalary(4700.00);ft.setBonus(570.00);

		vh.setMake("B M W X6");vh.setPlate("ABC 123");vh.setYear(2010);

		vh.setSpeed("120");

		

		/*ft.printMyData();

		System.out.println("=========================================");

		CommissionBasedPartTime cb = new CommissionBasedPartTime();

		Car vh2 = new Car();

		cb1.setName("Ellen");cb1.setAge(22);cb1.setVehicle(vh2);cb1.setRate(30);cb1.setHoursworked(10);cb1.setCommissionPercent(15);

		vh2.setMaker("Toyota");vh2.setRegPlate("CDE 456");vh2.setTypeOfTransmission("Automatic");vh2.setColor("Black");

		cb1.printMyData();

		

		System.out.println("=========================================");

		

		FixedBasedPartTime fpt1 = new FixedBasedPartTime();

		Motorcycle mt1 = new Motorcycle();

		fpt1.setName("Bob");fpt1.setAge(30);fpt1.setVehicle(mt1);mt1.setMaker("Harley DavidSon");mt1.setRegPlate("XYZ 000");mt1.setTypeOfTransmission("Manual");

		mt1.setColor("Black");fpt1.setRate(10);fpt1.setHoursworked(20);fpt1.setFixedAmount(75);

		fpt1.printMyData();*/

    }




    
}
