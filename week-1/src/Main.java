public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 0, 0, "Cold");
        SpaceStation iss = new SpaceStation("SpaceX", 100, 100, 5);


        Cargo cargo = new Cargo(50, "50 KG Somethin");
        LightDrone lightDrone = new LightDrone("LD1");


        DeliveryTask task = new DeliveryTask(earth, iss, cargo);
        System.out.println(task.assignDrone(lightDrone) ? "success": "fail");

        task.completeTask();
    }
}
