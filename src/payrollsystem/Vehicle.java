/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author Akshay
 */
public class Vehicle {
    private String make;
    private String plate;
    private String Company;
    private int Year;

    public Vehicle(String make, String plate, String Company, int Year) {
        this.make = make;
        this.plate = plate;
        this.Company = Company;
        this.Year = Year;
    }
    
    

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
     

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    public void printMyData() {
      
       System.out.println("motorcycle plate is:" + getPlate());
       System.out.println("motorcycle make is :" + getMake());
       System.out.println("motorcycle company is :" + getCompany());
       System.out.println("motorcycle year is :" + getYear());
       
    }
    
}