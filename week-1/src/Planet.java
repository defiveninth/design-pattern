class Planet extends CelestialBody {
    private String atmosphereType;

    public Planet(String name, int coordinateX, int coordinateY, String atmosphereType) {
        super(name, coordinateX, coordinateY);
        this.atmosphereType = atmosphereType;
    }
}