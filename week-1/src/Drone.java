abstract class Drone {
    protected String id;
    protected String status;
    protected int cargoCapacity;
    protected int currentCargoWeight;
    protected int speed;

    public Drone(String id, int cargoCapacity, int speed) {
        this.id = id;
        this.status = "IDLE";
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = 0;
        this.speed = speed;
    }

    public abstract double calculateFlightTime(double distance);

    public boolean canCarry(int weight) {
        return this.currentCargoWeight + weight <= this.cargoCapacity;
    }

    public boolean assignCargo(int weight) {
        if (canCarry(weight)) {
            this.currentCargoWeight += weight;
            return true;
        }
        return false;
    }

    public void completeDelivery() {
        this.status = "IDLE";
        this.currentCargoWeight = 0;
    }
}