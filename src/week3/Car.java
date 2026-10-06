 
package week3; 
 
public class Car {
    private String plateNumber;
    private String model;
    private double mileage;
    private double fuelLevel;
    private double tankCapacity;
    
    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity){
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }
    
    public void drive(double km){
        if((this.fuelLevel - (km * 0.1))>=0){
            this.mileage = this.mileage +km;
            this.fuelLevel = this.fuelLevel - (km * 0.1);
            System.out.println("Driving "+km+" km...");
        }else{
            System.out.println("Not enough fuel for this trip!");
        }
    }
    
    public void refuel(double amount){
        System.out.println("Refueling "+amount+" liters...");
        if(this.fuelLevel + amount > this.tankCapacity){
            System.out.println("Tank is full, extra fuel discarded.");
            this.fuelLevel = this.tankCapacity;
        }else{
            this.fuelLevel = this.fuelLevel + amount;
        }
    }
    
    public void checkStatus(){
        if(this.fuelLevel < (this.tankCapacity * 0.1)){
            System.out.println("Low fuel warning!");
        }
        System.out.println("The Current Mileage: "+this.mileage+" km");
        System.out.println("The Current Fuel Level: "+this.fuelLevel+"/"+this.tankCapacity+" liters");
    }
    
    public String getModel(){
        return this.model;
    }
}
