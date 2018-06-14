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
public class Motorcycle {
    
    private String Make;
    private String Speed;
    private String Gear;
    private String color;

    public Motorcycle(String Make, String Speed, String Gear, String color) {
        this.Make = Make;
        this.Speed = Speed;
        this.Gear = Gear;
        this.color = color;
    }

    Motorcycle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getSpeed() {
        return Speed;
    }

    public void setSpeed(String Speed) {
        this.Speed = Speed;
    }

    public String getGear() {
        return Gear;
    }

    public void setGear(String Gear) {
        this.Gear = Gear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
     public void printMyData() {
      
       System.out.println("motorcycle speed is:" + getSpeed());
       System.out.println("motorcycle make is :" + getMake());
       System.out.println("motorcycle gear is :" + getGear());
       System.out.println("motorcycle color is :" + getColor());
     }
    
}
