import Behaviours.IDriveable;

public abstract class Car implements IDriveable {

    private String model;
    private int fuelLevel;

    public Car(String model, int fuelLevel){
        this.model = model;
        this.fuelLevel = fuelLevel;
    }

    public String drive() {
        return "vroomy vroomy vroomy";
    }

    public void reFuel() {
        this.fuelLevel = 100;
    }

    public String getModel(){
        return this.model;
    }

    public int getFuelLevel(){
        return this.fuelLevel;
    }

}
