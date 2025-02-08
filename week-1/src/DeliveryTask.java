class DeliveryTask {
    private CelestialBody origin;
    private CelestialBody destination;
    private Cargo cargo;
    private Drone assignedDrone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        this.origin = origin;
        this.destination = destination;
        this.cargo = cargo;
        this.assignedDrone = null;
    }

    public boolean assignDrone(Drone drone) {
        if (drone.canCarry(this.cargo.getWeight())) {
            this.assignedDrone = drone;
            drone.assignCargo(this.cargo.getWeight());
            return true;
        }
        return false;
    }

    public void completeTask() {
        if (this.assignedDrone != null) {
            this.assignedDrone.completeDelivery();
            System.out.println("Delivery  successfull completed");
        }
    }
}