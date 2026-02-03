public class Machine {
    private String model;
    private String type;
    private Worker operator;

    public Machine(String model, String type, Worker operator) {
        this.model = model;
        this.type = type;
        this.operator = operator;
    }
    public String getMachineDetail() {
        return "Koneen tiedot: " + type + ", " + model + "\n" +
        "Työntekijän tiedot: " + operator.getWorkerName() + ", " + operator.getWorkerRole();
    }
}
