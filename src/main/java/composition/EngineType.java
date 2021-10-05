package composition;

public enum EngineType {
    PETROL(150),
    ELECTRIC(200),
    DIESEL(130);

    private final int horsePower;

    EngineType(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
