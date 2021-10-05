package composition;

public class PetrolEngine implements Engine {

    @Override
    public String runningOn() {
        return "Petrol";
    }
}
