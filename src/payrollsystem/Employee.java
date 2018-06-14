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

    public abstract class Employee implements IPrintable
    {
        
        private String Name;
        private int Age;
        private double Earnings;
        private Vehicle Vehicle;

    public Employee(String Name, int Age, double Earnings, Vehicle Vehicle) {
        this.Name = Name;
        this.Age = Age;
        this.Earnings = Earnings;
        this.Vehicle = Vehicle;
    }

    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public double getEarnings() {
        return Earnings;
    }

    public void setEarnings(double Earnings) {
        this.Earnings = Earnings;
    }

    public Vehicle getVehicle() {
        return Vehicle;
    }

    public void setVehicle(Vehicle Vehicle) {
        this.Vehicle = Vehicle;
    }
        

    
        
        public int CalcBirthYear()
        {
            return 2018-Age;
        }
     
        @Override
        public void printMyData(){
           
        }
    }

