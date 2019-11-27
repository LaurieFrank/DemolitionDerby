import Behaviours.IDriveable;

import java.util.ArrayList;

public class RaceTrack {

    private ArrayList<IDriveable> vehiclesOnTrack;
    private ArrayList<RaceCar> carsInRace;
    private boolean raceInProgress;
    private int laps;
//    private Ambulance ambulance;

    public RaceTrack(int laps){
//        ambulance = new Ambulance(50, 5);
        vehiclesOnTrack = new ArrayList<IDriveable>();
        carsInRace = new ArrayList<RaceCar>();
        raceInProgress = false;
        this.laps = laps;
    }

    public ArrayList<IDriveable> getVehiclesOnTrack(){
        return this.vehiclesOnTrack;
    }

    public ArrayList<RaceCar> carsInRace(){
        return this.carsInRace;
    }

    public void enlistForRace(RaceCar car){
        if(car.getValue() <= 500){
            carsInRace.add(car);
            vehiclesOnTrack.add(car);
        }
    }

    public void addVehicleToTrack(IDriveable vehicle){
        vehiclesOnTrack.add(vehicle);
    }

    public void startRace(){
        if(carsInRace.size() == vehiclesOnTrack.size()){
            this.raceInProgress = true;
        }
    }

    public void crash(RaceCar car1, RaceCar car2){
        if (car1.getCarIntegrity() > car2.getCarIntegrity()) {
            car2.hasLostCrash();
        }
        else if(car1.getCarIntegrity() < car2.getCarIntegrity()){
            car2.hasLostCrash();
        }
        else {
            car1.hasLostCrash();
            car2.hasLostCrash();
        }
    }

    public void needAmbulance(RaceCar car, Ambulance ambulance, String person){
        if(car.getCarIntegrity() == 0){
            carsInRace.remove(car);
            vehiclesOnTrack.add(ambulance);
            ambulance.addPerson(person);
            ambulance.treatPerson();
        }
    }

}
