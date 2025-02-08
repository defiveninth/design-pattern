class SpaceStation extends CelestialBody {
    private int stationLevel;

    public SpaceStation(String name, int coordinateX, int coordinateY, int stationLevel) {
        super(name, coordinateX, coordinateY);
        this.stationLevel = stationLevel;
    }
}