public class RaceCar extends Car{

    private int value;
    protected int carIntegrity;

    public RaceCar(String model, int fuelLevel, int value, int carIntegrity){
        super(model, fuelLevel);
        this.value = value;
        this.carIntegrity = carIntegrity;

    }

    public int getValue(){
        return this.value;
    }

    public int getCarIntegrity(){
        return this.carIntegrity;
    }

    public int hasLostCrash(){
        return this.carIntegrity -= 1;
    }

}
