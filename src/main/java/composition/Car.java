package composition;

public class Car {

    private final EngineType engine;
    private final InfotaintmentSystem infotaintmentSystem;
    private final SelfDrivingLevel selfDrivingLevel;

    public Car(EngineType engine, InfotaintmentSystem infotaintmentSystem, SelfDrivingLevel selfDrivingLevel) {
        this.engine = engine;
        this.infotaintmentSystem = infotaintmentSystem;
        this.selfDrivingLevel = selfDrivingLevel;
    }

}
