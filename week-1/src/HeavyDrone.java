class HeavyDrone extends Drone {
    public HeavyDrone(String id) {
        super(id, 500, 10);
    }

    @Override
    public double calculateFlightTime(double distance) {
        return distance / this.speed;
    }
}