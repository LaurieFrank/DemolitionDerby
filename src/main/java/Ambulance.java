import Behaviours.IDriveable;

import java.util.ArrayList;

public class Ambulance implements IDriveable {

    private int fuel;
    private boolean siren;
    private ArrayList<String> people;
    private int medicalSupplies;

    public Ambulance(int fuel, int medicalSupplies){
        this.fuel = fuel;
        this.siren = false;
        this.people = new ArrayList<String>();
        this.medicalSupplies = medicalSupplies;
    }

    public ArrayList<String> getInjuredPeople(){
        return this.people;
    }

    public String drive() {
        this.siren = true;
        return "Nee Naw Nee Naw Nee Naw, [faint screams of pain between sirens]";
    }

    public void reFuel() {
        this.fuel = 100;
    }

    public void addPerson(String injuredPerson){
        this.people.add(injuredPerson);
    }

    public void treatPerson(){
        if(this.medicalSupplies > 0){
            this.medicalSupplies -= 1;
        }
    }

}
