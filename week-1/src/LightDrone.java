class LightDrone extends Drone {
    public LightDrone(String id) {
        super(id, 100, 20);
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / this.speed;
    }
}