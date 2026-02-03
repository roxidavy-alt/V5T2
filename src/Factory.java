import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Machine> machines;
    
    public Factory(String name) {
        this.name = name;
        this.machines = new ArrayList<>();
    }

    public void addMachine(Machine machine) {
        machines.add(machine);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Machine> getMachines() {
        return machines;
    }
}
