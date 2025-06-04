public class Car {

    String make;
    String model;
    int year;
    double mpg;
    double milesDriven;
    double fuelCapacity;
    double fuelRemaining; 

    public Car(String mk, String mdl, int yr, double mg, double md, double fc, double fr) {
        make = mk;
        model = mdl;
        year = yr;
        mpg = mg;
        milesDriven = md;
        fuelCapacity = fc;
        fuelRemaining = fr;
    }

    public void fillTank (double g){
        double space = fuelCapacity-fuelRemaining;
        if(g < space){
            fuelRemaining += g;
        }else{
            fuelRemaining = fuelCapacity;
        }
    }

    public void drive (double m){
        double fuelUsed = m/mpg;
        fuelRemaining -= fuelUsed;
        milesDriven += m;
    }

    public String toString (){
        return make + " " + model + " " + year + "\nMPG: " + mpg + "\nMiles Driven: " + milesDriven + "\nFuel Capacity: " + fuelCapacity + "\nFuel Remaining: " + fuelRemaining; 
    }

    public double getFuelRemaining (){
        return fuelRemaining;
    }


}