package autoparts;

public class BMWFactory implements AutoPartsFactory {

    @Override
    public EnginePart createEngine() {
        return new BMWEngine();
    }

    @Override
    public BrakePart createBrake() {
        return new BMWBrake();
    }
}
