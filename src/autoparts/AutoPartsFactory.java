package autoparts;

public interface AutoPartsFactory {

    EnginePart createEngine();

    BrakePart createBrake();
}