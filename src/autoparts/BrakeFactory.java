package autoparts;

public class BrakeFactory extends PartFactory {

    @Override
    public AutoPart createPart() {
        return new Brake();
    }
}