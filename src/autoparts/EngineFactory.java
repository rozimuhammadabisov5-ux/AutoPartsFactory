package autoparts;

public class EngineFactory extends PartFactory {

    @Override
    public AutoPart createPart() {
        return new Engine();
    }
}