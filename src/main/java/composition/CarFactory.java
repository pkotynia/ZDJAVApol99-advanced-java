package composition;

public class CarFactory {

    public static void main(String[] args) {
        Car passat = new Car(EngineType.DIESEL, new SmallInfotainment(), new BasicSelfDrivingLevel());

        System.out.println(passat);

        Car id4 = new Car(EngineType.ELECTRIC, () -> 12, () -> 1);

        System.out.println(id4);

        EngineType petrolEngine = EngineType.PETROL;
        System.out.println(petrolEngine.getHorsePower());

    }
}
