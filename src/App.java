import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna tehtaalle nimi:");
        String factoryName = sc.nextLine();
        Factory factory = new Factory(factoryName);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Lisää kone");
            System.out.println("2) Listaa kaikki koneet");
            System.out.println("0) Lopeta ohjelma");

            String input = sc.nextLine();

            if (input.isEmpty()) {
                continue;
            }
                
                int i = Integer.parseInt(input);

                switch (i) {
                    case 1:
                        System.out.println("Anna koneen tyyppi:");
                        String machineType = sc.nextLine();
                        System.out.println("Anna koneen malli:");
                        String machineModel = sc.nextLine();
                        System.out.println("Anna työntekijän nimi:");
                        String workerName = sc.nextLine();
                        System.out.println("Anna työntekijän ammattinimike:");
                        String workerRole = sc.nextLine();
                        Worker worker = new Worker(workerName, workerRole);
                        Machine machine = new Machine(machineModel, machineType, worker);
                        factory.addMachine(machine);
                        System.out.println("Kone lisätty!");
                        break;
                    case 2:
                        System.out.println("Tehtaasta Metallitehdas löytyy seuraavat koneet:");
                        for (Machine m : factory.getMachines()) {                            
                            System.out.println(m.getMachineDetail());
                            System.out.println("");}                            
                        break;
                    case 0:
                        exit = true;
                        System.out.println("Kiitos ohjelman käytöstä.");
                        break;
                    default:
                        break;    
                }
        } 
        sc.close();
        
    }
}
