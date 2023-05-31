package targil7;

public class Boat extends Element{
    Material material;
    public Boat(double width, double length, Material m, String path) {
        super(width, length, path);
        this.material=m;
    }

    public Material getMaterial() {
        return material;
    }
    public String getName() {
        return "boat";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
    }

    @Override
    public void accept(ElementCountVisitor elementCountVisitor) {
        elementCountVisitor.visit(this);
    }

    @Override
    public void accept(ShortPrintVisitor shortPrintVisitor) {
        shortPrintVisitor.visit(this);
    }

    @Override
    public void accept(TotalAreaVisitor totalAreaVisitor) {
        totalAreaVisitor.visit(this);
    }

    @Override
    public void accept(LongPrintVisitor longPrintVisitor) {
        longPrintVisitor.visit(this);
    }
}
