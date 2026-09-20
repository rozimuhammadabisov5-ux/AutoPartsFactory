package autoparts;

public class ToyotaFactory implements AutoPartsFactory {

    @Override
    public EnginePart createEngine() {
        return new ToyotaEngine();
    }

    @Override
    public BrakePart createBrake() {
        return new ToyotaBrake();
    }
}