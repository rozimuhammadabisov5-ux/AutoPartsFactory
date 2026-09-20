package autoparts;

public class Main {

    public static void main(String[] args) {

        PartFactory engineFactory = new EngineFactory();
        engineFactory.showPart();

        PartFactory brakeFactory = new BrakeFactory();
        brakeFactory.showPart();

        System.out.println();

        AutoPartsFactory toyotaFactory = new ToyotaFactory();

        EnginePart toyotaEngine = toyotaFactory.createEngine();
        BrakePart toyotaBrake = toyotaFactory.createBrake();

        toyotaEngine.showInfo();
        toyotaBrake.showInfo();

        System.out.println();

        AutoPartsFactory bmwFactory = new BMWFactory();

        EnginePart bmwEngine = bmwFactory.createEngine();
        BrakePart bmwBrake = bmwFactory.createBrake();

        bmwEngine.showInfo();
        bmwBrake.showInfo();
    }
}