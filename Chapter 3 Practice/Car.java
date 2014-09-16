

/**
 * The Car class tracks the fuel remaining in the car as it is driven based on the fuel efficiency
 * 
 * @author (ikbiel) 
 * @version (12 September 2014)
 */
public class Car
{
    /** the fuel efficiency of this car measured in miles per gallon */
    private double fuelEfficiency;
    
    /** the number of gallons of fuel left in this car's tank */
    private double fuelInTank;

    /**
     * Constructor for a car of the specified fuel efficiency.
     */
    public Car(double efficiency)
    {
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * Adds the specified number of gallons of fuel to this car's tank.
     *
     * @pre        specified number of gallons doesn't exceed this car's tank's capacity
     * @param    gallons    number of gallons of  fuel to add this car's tank
     */
    public void addGas(double gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
    }
    

    /**
     * Updates the fule in this car's tank based on the specified number of miles driven and this 
     * car's fuel efficiency
     * @pre     the specified number of miles doesn't consume more than the fuel in this car's tank
     * @param   miles   number of miles this car has driven
     * @return  description of the return value
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles / this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
    }
    
    /**
     * Returns the number of gallons of fuel left in this car's tank. 
     * @return  the number of gallons of fuel left in this car's tank
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }


}
