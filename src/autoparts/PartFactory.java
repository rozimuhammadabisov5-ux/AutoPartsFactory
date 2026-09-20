package autoparts;

public abstract class PartFactory {

    public abstract AutoPart createPart();

    public void showPart() {
        AutoPart part = createPart();
        part.showInfo();
    }
}