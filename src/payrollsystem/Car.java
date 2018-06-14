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
public class Car {
    private String Make;
    private String Plate;
    private String Speed;
    private int Year;

    public Car(String Make, String Plate, String Speed, int Year) {
        this.Make = Make;
        this.Plate = Plate;
        this.Speed = Speed;
        this.Year = Year;
    }
    
    

    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getPlate() {
        return Plate;
    }

    public void setPlate(String Plate) {
        this.Plate = Plate;
    }

    public String getSpeed() {
        return Speed;
    }

    public void setSpeed(String Speed) {
        this.Speed = Speed;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
   public void printMyData() {
      
       System.out.println("car speed is:" + getSpeed());
       System.out.println("car make is :" + getMake());
       System.out.println("car plate is :" + getPlate());
       System.out.println("car year is :" + getYear());
       
   }
   }